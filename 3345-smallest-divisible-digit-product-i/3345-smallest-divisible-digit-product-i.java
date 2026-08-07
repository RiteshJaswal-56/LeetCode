class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int num = n;
            int mul = 1;
            while(num!=0){
                int digit = num % 10;
                mul *= digit;
                num /= 10;
            }

            if(mul % t == 0){
                return n;
            }
            n++;
        }
    }
}