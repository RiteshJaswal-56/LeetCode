class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            int x = nums[i];
            int temp = x;
            int sum = 0;
            while(temp!=0){
                int digit = temp % 10;
                sum += digit;
                temp = temp / 10;
            }
            if(i == sum){
                return i;
            }
        }
        return -1;
    }
}