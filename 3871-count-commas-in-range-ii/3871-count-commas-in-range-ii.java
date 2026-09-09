class Solution {
    public long countCommas(long n) {
        long commas = 0;
        long power = 1000;
        
        while (n >= power) {
            commas += (n - power + 1);
            power *= 1000;
        }
        
        return commas;
    }
}