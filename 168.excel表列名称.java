/*
 * @lc app=leetcode.cn id=168 lang=java
 *
 * [168] Excel表列名称
 */
class Solution {
    public String convertToTitle(int n) {
        StringBuffer sb = new StringBuffer();
        while (n != 0) {
            char cur = n % 26 == 0 ? 'Z' : (char) (64 + n % 26);
            n = cur == 'Z' ? n / 26 - 1 : n / 26;
            sb.append(cur);
        }
        return sb.reverse().toString();
    }
}
