class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] arr = new int[n+n];
        int j = n;
        int s = 0;
        for(int i=0;i<n;i++){
            arr[s++] = nums[i];
            arr[s++] = nums[j++];
        }
        return arr;
    }
}