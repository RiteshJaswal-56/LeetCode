class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int close = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                open++;
            }
            else{
                if(open > 0){
                    open--;
                }
                else{
                    close++;
                }
            }
        }
        int minadd = 0;
        if(open > 0 || close > 0){
            minadd = open+close;
        }
        return minadd;
    }
}