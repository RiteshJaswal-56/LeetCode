class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String res = s+s;
        String str = res.substring(1,res.length()-1);
        if(str.contains(s)){
            return true;
        }
        return false;
    }
}