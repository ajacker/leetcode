/*
 * @lc app=leetcode.cn id=476 lang=java
 *
 * [476] 数字的补数
 */

// @lc code=start
class Solution {
    public int findComplement(int num) {
        int res = 0;
        int count = 0;
        while (num != 0) {
            int cur = num & 0x000001;
            int n = cur ^ 1;
            res |= n << count++;
            num >>>= 1;
        }
        return res;
    }
}
// @lc code=end
