/*
 * @lc app=leetcode.cn id=541 lang=java
 *
 * [541] 反转字符串 II
 */

// @lc code=start
class Solution {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int start = 0;
        while (start < chars.length) {
            int revLen = Integer.min(k, chars.length - start);
            for (int p = start, q = start + revLen - 1; p < q; p++, q--) {
                if (chars[p] != chars[q]) {
                    chars[p] ^= chars[q];
                    chars[q] ^= chars[p];
                    chars[p] ^= chars[q];
                }
            }
            start += 2 * k;
        }
        return new String(chars);
    }
}
// @lc code=end
