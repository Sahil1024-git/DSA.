class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        // if(matrix[r-1][0]!=matrix[0][c-1]){
        //     return false;
        // }
        int cCheck=r*c;
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(matrix[i][j]!=matrix[i-1][j-1]){
                    return false;
                }
            }
        }
        return true;

    }
}
