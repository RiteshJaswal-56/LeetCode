class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];
        int val = 0;
        List<Integer> result = new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(nums[val] == i){
                val++;
            }
            else{
                result.add(i);
            }
        }
        return result;
    }
}