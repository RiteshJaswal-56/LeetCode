class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int [] arr = {0,0};
        int n = mat.length;
        int m = mat[0].length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] > max){
                    max = mat[i][j];
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
}