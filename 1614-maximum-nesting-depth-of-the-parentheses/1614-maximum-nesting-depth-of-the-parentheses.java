class Solution {
    public int maxDepth(String s) {
        int maxdepth = 0;
        int counter = 0;
        for(char ch : s.toCharArray()){
            if(ch == '(') counter++;
            if(ch == ')') counter--;
            maxdepth = Math.max(maxdepth , counter);
        }
        return maxdepth;
    }
}