class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxsum = Integer.MIN_VALUE;
        int prefixSum = 0;
        for(int i=0;i<n;i++){
            if(prefixSum < 0){
                prefixSum = 0;
            }
            prefixSum += nums[i];
            maxsum = Math.max(prefixSum , maxsum);
        }
        return maxsum;
    }
}