class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int totalsum = 0;
        for (int num : nums) {
            totalsum += num;
        }
        int target = totalsum - x;
        if (target < 0) {
            return -1;
        }
        if (target == 0) {
            return n;
        }
        int maxlength = -1;
        int currentsum = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {
            currentsum += nums[i];
            while (currentsum > target && j <= i) {
                currentsum -= nums[j];
                j++;
            }
            if (currentsum == target) {
                maxlength = Math.max(maxlength, i - j + 1);
            }
        }
        return maxlength == -1 ? -1 : n - maxlength;
    }
}