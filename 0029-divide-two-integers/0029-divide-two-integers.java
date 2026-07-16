class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        int ans = Math.abs(dividend / divisor);
        if(dividend < 0 ^ divisor < 0){
            ans = -ans;
        }
        return ans;
    }
}