class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        double sum = 0;
        double average = 0;
        double maxavg = Integer.MIN_VALUE;
        while(j<n){
            sum += nums[j];
            if((j-i+1) < k) j++; 
            else if((j-i+1) == k){
                average = sum / k;
                maxavg = Math.max(average , maxavg);
                sum-=nums[i];
                i++;
                j++;
            }
        }
        return maxavg;
    }
}