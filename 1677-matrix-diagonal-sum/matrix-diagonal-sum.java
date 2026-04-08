class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    count+=mat[i][j];
                }
            }
        }
        for(int i=0,j=n-1;i<n&&j>=0;i++,j--){
            count+=mat[i][j];
        }
        if(n%2!=0){
            count -= mat[n/2][n/2];
        }
        return count;
    }
}