class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int ans = Integer.MAX_VALUE;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[left] == nums[mid] && nums[mid] == nums[right]){
                ans = Math.min(nums[left] , ans);
                left++;
                right--;
                continue;
            }
            if(nums[left] <= nums[mid]){
                ans = Math.min(nums[left] , ans);
                left = mid + 1;
            }
            else{
                ans = Math.min(nums[mid] , ans);
                right = mid - 1;
            }
        }
        return ans;
    }
}