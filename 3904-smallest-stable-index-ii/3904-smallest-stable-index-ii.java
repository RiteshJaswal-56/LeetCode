class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] sufMin = new int[n];
        sufMin[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            sufMin[i] = Math.min(sufMin[i + 1], nums[i]);
        }
        
        int preMax = nums[0];
        for (int i = 0; i < n; i++) {
            preMax = Math.max(preMax, nums[i]);
            
            int instabilityScore = preMax - sufMin[i];
            if (instabilityScore <= k) {
                return i;
            }
        }
        
        return -1;
    }
}