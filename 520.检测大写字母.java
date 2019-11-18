/*
 * @lc app=leetcode.cn id=520 lang=java
 *
 * [520] 检测大写字母
 */

// @lc code=start
class Solution {
    public boolean detectCapitalUse(String word) {
        char[] array = word.toCharArray();
        int len = array.length;
        int upperCount = 0;
        for (int i = 0; i < len; i++) {
            if (Character.isUpperCase(array[i]))
                upperCount++;
        }
        if (upperCount == 0 || upperCount == len) {
            return true;
        } else if (upperCount == 1) {
            return len > 0 && Character.isUpperCase(array[0]);
        } else
            return false;
    }
}
// @lc code=end
