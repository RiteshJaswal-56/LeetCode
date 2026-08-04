class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer , Integer > map = new HashMap<>();
        int n = arr.length;
        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i) + 1);
            }
            else{
                map.put(i , 1);
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int x : map.values()){
            if(set.contains(x)){
                return false;
            }
            else{
                set.add(x);
            }
        }
        return true;
    }
}