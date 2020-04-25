/*
 * @lc app=leetcode.cn id=392 lang=java
 *
 * [392] 判断子序列
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        for (char ch : s.toCharArray()) {
            // 不匹配的跳过
            while (i < t.length() && t.charAt(i) != ch) {
                i++;
            }
            // 匹配的计数
            i++;
        }
        return i <= t.length();
    }
}
// @lc code=end
