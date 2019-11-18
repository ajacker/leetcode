/*
 * @lc app=leetcode.cn id=509 lang=java
 *
 * [509] 斐波那契数
 */

// @lc code=start
class Solution {
    public int fib(int N) {
        return fib(N, 0, 1);
    }
    /**
     * 使用尾递归优化
     * @param n 还需要递归的次数
     * @param ret1 上一个元素
     * @param ret2 上上个元素
     * @return 斐波那契数列的第n项
     */
    public int fib(int n, int ret1, int ret2) {
        if (n == 0) {
            return ret1;
        }
        return fib(n - 1, ret1 + ret2, ret1);
    }
}
// @lc code=end
