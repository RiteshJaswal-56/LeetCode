class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int ans = 0;
        for(int i=0;i<=n;i++){
            ans += i;
        }
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        return ans - sum;
    }
}