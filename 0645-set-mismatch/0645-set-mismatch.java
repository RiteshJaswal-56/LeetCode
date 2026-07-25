class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        HashMap<Integer , Integer > map = new HashMap<>();
        int [] result = new int[2];
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int i=1;i<=n;i++){
            if(map.containsKey(i)){
                if(map.get(i) == 2){
                    result[0] = i;
                }
            }
            else{
                result[1] = i;
            }
        }
        return result;
    }
}