import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=821 lang=java
 *
 * [821] 字符的最短距离
 */

// @lc code=start
class Solution {
    public int[] shortestToChar(String S, char C) {
        char[] chars = S.toCharArray();
        int len = chars.length;
        int[] res = new int[len];
        Arrays.fill(res, Integer.MAX_VALUE);
        for (int i = 0; i < chars.length; i++) {
            char chr = chars[i];
            if (chr == C) {
                int j = 0;
                while (i - j >= 0 || i + j < len) {
                    if (i - j >= 0) {
                        res[i - j] = Math.min(j, res[i - j]);
                    }
                    if (i + j < len) {
                        res[i + j] = Math.min(j, res[i + j]);
                    }
                    j++;
                }
            }
        }
        return res;
    }
}
// @lc code=end
