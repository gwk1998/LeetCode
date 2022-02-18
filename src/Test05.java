public class Test05 {
    public static void main(String[] args) {
        int[] coins = new int[]{1,2,5};
        int amount = 11;
        System.out.print(coinChange(coins,amount));
    }

    // W 为背包总体积
    // N 为物品数量
    // weights 数组存储 N 个物品的重量
    // values 数组存储 N 个物品的价值
    public int knapsack(int W, int N, int[] weights, int[] values) {
        int[][] dp = new int[N + 1][W + 1];
        for (int i = 1; i <= N; i++) {
            int w = weights[i - 1], v = values[i - 1];
            for (int j = 1; j <= W; j++) {
                if (j >= w) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w] + v);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[N][W];
    }

    public static int coinChange(int[] coins, int amount) {
        if (amount == 0 || coins == null) return 0;
        int[] dp = new int[amount + 1];
        for (int coin : coins) {

            for (int i = coin; i <= amount; i++) { //将逆序遍历改为正序遍历
                if (i == coin) {
                    dp[i] = 1;
                } else if (dp[i] == 0 && dp[i - coin] != 0) {
                    dp[i] = dp[i - coin] + 1;

                } else if (dp[i - coin] != 0) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] == 0 ? -1 : dp[amount];
    }
}
