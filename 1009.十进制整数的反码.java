/*
 * @lc app=leetcode.cn id=1009 lang=java
 *
 * [1009] 十进制整数的反码
 */

// @lc code=start
class Solution {
    public int bitwiseComplement(int N) {
        char[] str = Integer.toBinaryString(N).toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : str) {
            if (c == '0') {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}
// @lc code=end
