/*
 * @lc app=leetcode.cn id=686 lang=java
 *
 * [686] 重复叠加字符串匹配
 */

// @lc code=start

class Solution {
    public int repeatedStringMatch(String A, String B) {
        int i = 1;
        StringBuilder s = new StringBuilder(A);
        int blength = B.length();
        while (s.length() < blength) {
            s.append(A);
            i++;
        }
        return s.lastIndexOf(B) == -1 ? ((s.append(A)).lastIndexOf(B) == -1 ? -1 : i + 1) : i;
    }
}
// @lc code=end
