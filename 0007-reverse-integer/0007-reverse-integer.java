class Solution {
    public int reverse(int x) {
        long reverse = 0;
        while(x != 0){
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
            
            if(reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE){
                return 0;
            }
        }
        return (int) reverse;
    }
}