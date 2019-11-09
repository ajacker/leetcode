/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现strStr()
 */
class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return 0;
        char[] chars = haystack.toCharArray();
        char[] nchars = needle.toCharArray();
        int result = -1;
        for (int i = 0; i < chars.length; i++) {
            for (int k = 0; k < nchars.length; k++) {
                if (k == 0 && result != -1) {
                    break;
                }
                if (i + k < chars.length && chars[i + k] == nchars[k]) {
                    result = i;
                } else {
                    result = -1;
                    break;
                }
            }

        }
        return result;
    }
}
