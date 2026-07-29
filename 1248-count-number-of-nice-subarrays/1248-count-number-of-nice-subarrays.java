class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int left = 0;
        int count = 0;
        int totalcount = 0;
        int prefix = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] % 2 != 0) {
                count++;
                prefix = 0;
            }

            while (count == k) {
                prefix++;

                if (nums[left] % 2 != 0) {
                    count--;
                }

                left++;
            }

            totalcount += prefix;
        }

        return totalcount;
    }
}