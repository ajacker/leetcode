/*
 * @lc app=leetcode.cn id=693 lang=java
 *
 * [693] 交替位二进制数
 */

// @lc code=start
class Solution {
    public boolean hasAlternatingBits(int n) {
        int last = -1;
        while (n != 0) {
            int cur = n % 2;
            if (last == cur) {
                return false;
            }else{
                last = cur;
            }
            n /= 2;
        }
        return true;
    }
}
// @lc code=end
