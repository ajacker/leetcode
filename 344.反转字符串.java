/*
 * @lc app=leetcode.cn id=344 lang=java
 *
 * [344] 反转字符串
 */
class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char temp = s[start];
            s[start++] = s[end];
            s[end--] = temp;
        }
    }
}
