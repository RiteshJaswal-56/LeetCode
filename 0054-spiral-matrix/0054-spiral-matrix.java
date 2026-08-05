class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int srow = 0;
        int scol = 0;
        int erow = m-1;
        int ecol = n-1;
        while(srow <= erow && scol <= ecol){
            for(int i=scol;i<=ecol;i++){
                result.add(matrix[srow][i]);
            }
            srow++;
            for(int i=srow;i<=erow;i++){
                result.add(matrix[i][ecol]);
            }
            ecol--;
            if(srow <= erow){
                for(int i=ecol;i>=scol;i--){
                    result.add(matrix[erow][i]);
                }
                erow--;
            }
            if(scol <= ecol){
                for(int i=erow;i>=srow;i--){
                    result.add(matrix[i][scol]);
                }
                scol++;
            }
        }
        return result;
    }
}