class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String , Integer > map= new HashMap<>();
        for(String word : words){
            if(map.containsKey(word)){
                map.put(word , map.get(word) + 1);
            }
            else{
                map.put(word , 1);
            }
        }
        List<String> result = new ArrayList<>();
        int index = 0;
        while(!map.isEmpty() && index < k){
            int freq = 0;
            String s = " ";

            for(String key : map.keySet()){
                if(map.get(key) > freq){
                    freq = map.get(key);
                    s = key;
                }
                else if (map.get(key) == freq && key.compareTo(s) < 0) {
                    s = key;
                }
            }
            result.add(s);
            index++;
            map.remove(s);
        }
        return result;
    }
}