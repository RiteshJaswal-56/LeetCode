class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        long max = Long.MIN_VALUE;
        long scmax = Long.MIN_VALUE;
        long thmax = Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            
            if(nums[i]>max){
                max = nums[i];
            }
        }
        
        for(int i=0;i<n;i++){
            if(nums[i] < max && nums[i]> scmax){
                scmax = nums[i];
            }
        }
       
        for(int i=0;i<n;i++){
            if(nums[i] < scmax && nums[i]> thmax){
                thmax = nums[i];
            }
        }
        if(thmax == Long.MIN_VALUE) return (int) max;
        return (int)thmax;
    }
}