class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int left = 1;
        int right = 0;
        for(int num : nums){
            right = Math.max(num , right);
        }
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int divisor = 0;
            for(int i : nums){
                divisor += (i + mid - 1) / mid;
                
            }
            if(divisor <= threshold){
                ans = mid;
                right = mid - 1;
                
            }
            else{
                left = mid + 1;
            }
        }
        return ans;
    }
}