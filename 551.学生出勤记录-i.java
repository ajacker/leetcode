/*
 * @lc app=leetcode.cn id=551 lang=java
 *
 * [551] 学生出勤记录 I
 */

// @lc code=start
class Solution {
    public boolean checkRecord(String s) {
        char[] chars = s.toCharArray();
        boolean flagA = false;
        byte countL = 0;
        for (int i = 0; i < chars.length; i++) {
            char cur = chars[i];
            if (cur == 'L') {
                countL++;
                if (countL > 2) {
                    return false;
                }
            } else {
                countL = 0;
                if (cur == 'A') {
                    if (flagA) {
                        return false;
                    } else {
                        flagA = true;
                    }
                }
            }
        }
        return true;
    }
}
// @lc code=end
