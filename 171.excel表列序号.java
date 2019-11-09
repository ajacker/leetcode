
/*
 * @lc app=leetcode.cn id=171 lang=java
 *
 * [171] Excel表列序号
 */
class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            int ins = chars.length - 1 - i;
            result += (int) (chars[i] - 64) * Math.pow(26, ins);
        }
        return result;
    }
}
