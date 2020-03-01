/*
 * @lc app=leetcode.cn id=925 lang=java
 *
 * [925] 长按键入
 */

// @lc code=start
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int j = 0;
        for (int i = 0; i < typed.length(); i++) {
            if (name.charAt(j) == typed.charAt(i)) {
                j++;
            }
            if (j == name.length())
                break;

        }
        return j == name.length();
    }
}
// @lc code=end
