/*
 * @lc app=leetcode.cn id=844 lang=java
 *
 * [844] 比较含退格的字符串
 */

// @lc code=start
class Solution {
    public boolean backspaceCompare(String S, String T) {
        StringBuffer a = new StringBuffer();
        StringBuffer b = new StringBuffer();
        char[] arrayA = S.toCharArray();
        char[] arrayB = T.toCharArray();
        for (char c : arrayA) {
            if (c != '#') {
                a.append(c);
            } else if (a.length() != 0) {
                a.deleteCharAt(a.length() - 1);
            }
        }
        for (char c : arrayB) {
            if (c != '#') {
                b.append(c);
            } else if (b.length() != 0) {
                b.deleteCharAt(b.length() - 1);
            }
        }
        return a.toString().equals(b.toString());

    }
}
// @lc code=end
