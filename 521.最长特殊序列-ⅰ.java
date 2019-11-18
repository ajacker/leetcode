/*
 * @lc app=leetcode.cn id=521 lang=java
 *
 * [521] 最长特殊序列 Ⅰ
 */

// @lc code=start
class Solution {
    public int findLUSlength(String a, String b) {
        // 如果两个字符串长度不一样，则较长的字符串本身不可能是短字符串的子序列，直接返回其长度即可
        // 如果两个字符串内容相等，那么他们独有的最长子序列不存在，返回 -1
        if (a.equals(b))
            return -1;
        return Integer.max(a.length(), b.length());
    }
}
// @lc code=end
