class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        int index = 0;
        for(int i=0;i<n;i++){
            if(arr[i] > ans){
                ans = arr[i];
                index = i;
            }
        }
        return index;
    }
}