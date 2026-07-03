class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int maxCount = 0;
        int majority = nums[0];

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                majority = nums[i];
            }
        }
        return majority;
    }
}