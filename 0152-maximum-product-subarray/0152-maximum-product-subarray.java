class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if(nums.length == 1){
            return nums[0];
        }
        int prefix = 1;
        int sufix = 1;
        int maxproduct = 0;
        for(int i=0;i<n;i++){
            if(prefix == 0) prefix = 1;
            if(sufix == 0) sufix = 1;

            prefix *= nums[i];
            sufix *= nums[n - 1 - i];
            
            maxproduct = Math.max(maxproduct, Math.max(prefix , sufix));
        }
        return maxproduct;
    }
}