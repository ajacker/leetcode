/*
 * @lc app=leetcode.cn id=557 lang=java
 *
 * [557] 反转字符串中的单词 III
 */

// @lc code=start
class Solution {
    char[] chars;

    public String reverseWords(String s) {
        chars = s.toCharArray();
        int wordStart = 0;
        while (wordStart < chars.length) {
            int wordEnd = findWordEnd(wordStart);
            for (int p = wordStart, q = wordEnd; p < q; p++, q--) {
                if (chars[p] != chars[q]) {
                    chars[p] ^= chars[q];
                    chars[q] ^= chars[p];
                    chars[p] ^= chars[q];
                }
            }
            wordStart = wordEnd + 2;
        }
        return new String(chars);
    }

    public int findWordEnd(int start) {
        for (int i = start; i < chars.length; i++) {
            if (chars[i] == ' ')
                return i - 1;
        }
        return chars.length - 1;
    }
}
// @lc code=end
