class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int max = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i] > max){
                max = nums[i];
                ans = i;
            }
        }
        return ans;
    }
}