/*
 * @lc app=leetcode.cn id=1025 lang=java
 *
 * [1025] 除数博弈
 */

// @lc code=start
class Solution {
    public boolean divisorGame(int N) {
        if (N == 1)
            return false;
        if (N == 2)
            return true;
        boolean[] dp = new boolean[N + 1];
        dp[1] = false;
        dp[2] = true;
        for (int i = 3; i <= N; i++) {
            dp[i] = false;
            for (int j = 1; j < i; j++) {
                // 找到一个可行解就代表alice在这个数字下可以赢
                if (i % j == 0 && !dp[i - j]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        // 递推出在N下是否可以赢
        return dp[N];
    }
}
// @lc code=end
