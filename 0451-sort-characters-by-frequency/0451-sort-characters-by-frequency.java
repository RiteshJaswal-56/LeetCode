class Solution {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch , map.get(ch) + 1);
            }else{
                map.put(ch , 1);
            }
        }
        while (!map.isEmpty()) {

            int maxFreq = 0;
            char maxChar = ' ';

            for (char ch : map.keySet()) {
                if (map.get(ch) > maxFreq) {
                    maxFreq = map.get(ch);
                    maxChar = ch;  
                }
            }
            for(int i=0;i<maxFreq;i++){
                sb.append(maxChar);
            }
            map.remove(maxChar);
        }
        return sb.toString();
    }
}