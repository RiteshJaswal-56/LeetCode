class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int n = nums.length;
        int m = divisors.length;
        int ans = -1;
        int best = -1;
        for(int i=0;i<m;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(nums[j] % divisors[i] == 0){
                    count++;
                }
            }
            if(count > ans || (count == ans && divisors[i] < best)){
                ans = count;
                best = divisors[i];
            }
        }
        return best;
    }
}