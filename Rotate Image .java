class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] result = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                result[j][m-1-i] = matrix[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = result[i][j];
            }
        }
    }
    
}
