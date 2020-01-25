/*
 * @lc app=leetcode.cn id=762 lang=java
 *
 * [762] 二进制表示中质数个计算置位
 */

// @lc code=start
class Solution {
    public int countPrimeSetBits(int L, int R) {
        int res = 0;
        for (int i = L; i <= R; i++) {
            if (judge(Integer.bitCount(i))) {
                res++;
            }
        }
        return res;
    }

    static boolean judge(int n) {
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i <= (int) Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
// @lc code=end
