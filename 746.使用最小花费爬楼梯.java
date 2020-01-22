/*
 * @lc app=leetcode.cn id=746 lang=java
 *
 * [746] 使用最小花费爬楼梯
 */

// @lc code=start
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        int last = cost.length - 1;
        dp[last] = cost[last];
        dp[last - 1] = cost[last - 1];
        for (int i = last - 2; i >= 0; i--) {
            dp[i] = Math.min(dp[i + 1] + cost[i], dp[i + 2] + cost[i]);
        }
        return Math.min(dp[0], dp[1]);
    }
}
// @lc code=end
