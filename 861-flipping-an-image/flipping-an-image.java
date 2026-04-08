class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] res = new int[n][n];

        for (int k = 0; k < n; k++) {
            int j = n - 1; // reset for every row
            
            for (int l = 0; l < n; l++) {
                // flip + invert
                res[k][l] = image[k][j] ^ 1;
                j--;
            }
        }
        return res;
    }
}