class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int n = nums.length;
        int i=-1;
        int j=-1;
        int ans=-1;
        for(int s=0;s<n;s++){
            if(nums[s] == 1){
                i=s;
                if(j!=-1){
                    int diff = Math.abs(i-j);
                    if (ans == -1 || diff < ans) {
                        ans = diff;
                    }
                }
            }
            else if(nums[s] == 2){
                j=s;
                if(i!=-1){
                    int diff = Math.abs(i-j);
                    if (ans == -1 || diff < ans) {
                        ans = diff;
                    }
                }
            }
        }
        return ans;
    }
}