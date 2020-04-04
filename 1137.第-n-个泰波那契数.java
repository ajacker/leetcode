/*
 * @lc app=leetcode.cn id=1137 lang=java
 *
 * [1137] 第 N 个泰波那契数
 */

// @lc code=start
class Solution {
    public int tribonacci(int n) {
        int[] tib = new int[38];
        tib[0] = 0;
        tib[1] = 1;
        tib[2] = 1;
        for (int i = 3; i <= n; i++) {
            tib[i] = tib[i - 1] + tib[i - 2] + tib[i - 3];
        }
        return tib[n];
    }
}
// @lc code=end
