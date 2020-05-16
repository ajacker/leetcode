/*
 * @lc app=leetcode.cn id=29 lang=java
 *
 * [29] 两数相除
 */

// @lc code=start
class Solution {
    public int divide(int dividend, int divisor) {
        boolean sign = !((dividend > 0) ^ (divisor > 0));
        int result = 0;
        if (dividend > 0) {
            dividend = -dividend;
        }
        if (divisor > 0) {
            divisor = -divisor;
        }
        while (dividend <= divisor) {
            int temp_result = -1;
            int temp_divisor = divisor;
            // 找到一次能够减去的最大的 divisor 的倍数
            while (dividend <= (temp_divisor << 1)) {
                if (temp_divisor <= (Integer.MIN_VALUE >> 1)) {
                    // 越界了
                    break;
                }
                temp_result = temp_result << 1;
                temp_divisor = temp_divisor << 1;
            }
            dividend = dividend - temp_divisor;
            result += temp_result;
        }
        if (sign) {
            if (result <= -Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            result = -result;
        }
        return result;
    }
}
// @lc code=end
