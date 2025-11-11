int minCostClimbingStairs(int* cost, int costSize) {

    int dp[costSize + 1];
    dp[0] = 0;
    dp[1] = 0;
    
    for (int i = 2; i <= costSize; i++) {
        int one_step = dp[i - 1] + cost[i - 1];
        int two_step = dp[i - 2] + cost[i - 2];
        dp[i] = (one_step < two_step) ? one_step : two_step;
    }
    
    return dp[costSize];
}
