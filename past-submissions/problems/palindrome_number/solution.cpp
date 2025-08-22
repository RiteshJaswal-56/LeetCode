class Solution {
public:
    bool isPalindrome(int x) {
        int y = x;
        if(x<0){
            return false;
        }
        long long rev = 0;
        while(x != 0){
            rev = rev * 10;
            rev = x % 10 + rev;
            x = x / 10;
        }  
        if(y == rev){
            return true;
        }
        else{
            return false;
        }
    }
};