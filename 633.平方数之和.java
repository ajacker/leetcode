/*
 * @lc app=leetcode.cn id=633 lang=java
 *
 * [633] 平方数之和
 */

// @lc code=start
class Solution {
    public boolean judgeSquareSum(int c) {
        for (int i = (int) Math.sqrt(c); i >= 0; i--) {
            int j = c - i * i;
            if (j >= 0 && Math.sqrt(j) % 1.0 == 0.0) {
                 return true;
            }
        }
        return false;
    }
}
// @lc code=end
