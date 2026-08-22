class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int x = n;
        int sum = 0;
        int product = 1;
        while(x!=0){
            int digit = x % 10;
            sum += digit;
            product *= digit;
            x = x / 10;
        }

        if(temp % (sum + product) == 0){
            return true;
        }
        return false;
    }
}