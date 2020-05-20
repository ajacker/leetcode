/*
 * @lc app=leetcode.cn id=62 lang=java
 *
 * [62] 不同路径
 */

// @lc code=start
class Solution {

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[n][m];
        dp[n - 1][m - 1] = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (i + 1 < n) {
                    dp[i][j] += dp[i + 1][j];

                }
                if (j + 1 < m) {
                    dp[i][j] += dp[i][j + 1];

                }
            }
        }
        return dp[0][0];
    }

}
// @lc code=end
