/*
 * @lc app=leetcode.cn id=796 lang=java
 *
 * [796] 旋转字符串
 */

// @lc code=start
class Solution {
    public boolean rotateString(String A, String B) {
        char[] aArray = A.toCharArray();
        char[] bArray = B.toCharArray();
        if (aArray.length != bArray.length) {
            return false;
        } else if (A.equals(B)) {
            return true;
        }
        int len = aArray.length;
        boolean res = false;
        for (int i = 0; i < len; i++) {
            boolean temp = true;
            for (int a = i, b = 0; b < len; a = (a + 1) % len, b++) {
                if (aArray[a] != bArray[b]) {
                    temp = false;
                    break;
                }
            }
            res |= temp;
        }
        return res;
    }
}
// @lc code=end
