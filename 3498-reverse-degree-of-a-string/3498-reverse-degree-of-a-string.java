class Solution {
    public int reverseDegree(String s) {
        int totaldegree = 0;
        for(int i=0;i<s.length();i++){
            int reverse = 26 - (s.charAt(i) - 'a');
            int position = i+1;
            totaldegree += reverse * position;
        }
        return totaldegree;
    }
}