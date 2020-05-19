/*
 * @lc app=leetcode.cn id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if (n == 0) {
            return 1;
        }
        double temp = 1;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        while (N > 0) {
            if (N % 2 == 1) {
                temp *= x;
            }
            x = x * x;
            N /= 2;
        }
        return temp;
    }
}
// @lc code=end
