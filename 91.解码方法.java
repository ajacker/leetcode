/*
 * @lc app=leetcode.cn id=91 lang=java
 *
 * [91] 解码方法
 */

// @lc code=start
class Solution {
    public int numDecodings(String s) {
        int len = s.length();
        int[] dp = new int[len + 1];
        dp[0] = dp[1] = s.charAt(0) - '0' > 0 ? 1 : 0;
        for (int i = 2; i < dp.length; i++) {
            int num1 = Integer.parseInt(s.substring(i - 1, i));
            int num2 = Integer.parseInt(s.substring(i - 2, i));
            dp[i] += num1 >= 1 && num1 <= 26 ? dp[i - 1] : 0;
            dp[i] += num2 >= 1 && num2 <= 26 && s.charAt(i - 2) != '0' ? dp[i - 2] : 0;
        }
        return dp[len];
    }
}
// @lc code=end
