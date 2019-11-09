/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2) return 0;
        int result = 0;
        int buy = prices[0];
        for (int i : prices) {
            int temp = i - buy;
            if(temp < 0)
                buy = i;
            else
            result=Math.max(temp, result);
        }
        return result;
    }
}

