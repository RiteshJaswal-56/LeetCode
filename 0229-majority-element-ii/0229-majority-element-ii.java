class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();

        for(int i=0;i<n;i++){

            if(result.contains(nums[i])){
                continue;
            }
            int count = 0;
            for(int j=i;j<n;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > n/3){
                result.add(nums[i]);
            }
        }
        return result;
    }
}