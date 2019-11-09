/*
 * @lc app=leetcode.cn id=122 lang=java
 *
 * [122] 买卖股票的最佳时机 II
 */
class Solution {
    public int maxProfit(int[] prices) {
        int dp_i_0=0, dp_i_1 = Integer.MIN_VALUE;
        for (int cur : prices) {
            int temp = dp_i_0;
            dp_i_0 = Math.max(dp_i_0, dp_i_1 + cur);
            dp_i_1 = Math.max(dp_i_1, temp - cur);
        }
        return dp_i_0;
    }
}

