/*
 * @lc app=leetcode.cn id=806 lang=java
 *
 * [806] 写字符串需要的行数
 */

// @lc code=start
class Solution {
    static int max = 100;

    public int[] numberOfLines(int[] widths, String S) {
        char[] chars = S.toCharArray();
        int lines = 1;
        int curLen = 0;
        int i = 0;
        while (i < chars.length) {
            if (curLen + widths[chars[i] - 'a'] <= max) {
                curLen += widths[chars[i] - 'a'];
                i++;
            } else {
                lines++;
                curLen = 0;
            }
        }
        return new int[] { lines, curLen };

    }
}
// @lc code=end
