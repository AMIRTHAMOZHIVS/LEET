class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[] dp = new double[query_row + 2];
        dp[0] = poured;

        for (int row = 0; row < query_row; row++) {
            for (int col = row; col >= 0; col--) {
                if (dp[col] > 1.0) {
                    double overflow = (dp[col] - 1.0) / 2.0;
                    dp[col] = overflow;
                    dp[col + 1] += overflow;
                } else {
                    dp[col] = 0.0;
                }
            }
        }

        return Math.min(1.0, dp[query_glass]);
    }
}