class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for(int i : piles){
            right = Math.max(i , right);
        }
        while(left < right){
            int mid = left + (right - left) / 2;
            int totalhours = 0;

            for(int pile: piles){
                totalhours += (pile + mid - 1) / mid;
            }
            if(totalhours <= h){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
}