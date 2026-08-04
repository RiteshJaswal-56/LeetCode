class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int x : nums){
            if(map.containsKey(x)){
                map.put(x , map.get(x)+1);
            }
            else{
                map.put(x , 1);
            }
        }
        int [] arr = new int[k];
        int index = 0;
        while(!map.isEmpty() && index < k){
            int freq = 0;
            int chr = ' ';

            for(int s : map.keySet()){
                if(map.get(s) > freq){
                    freq = map.get(s);
                    chr = s; 
                }
            }
            arr[index] = chr;
            index++;
            map.remove(chr);
        }
        return arr;
    }
}