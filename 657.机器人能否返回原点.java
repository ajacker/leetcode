/*
 * @lc app=leetcode.cn id=657 lang=java
 *
 * [657] 机器人能否返回原点
 */

// @lc code=start
class Solution {
    public boolean judgeCircle(String moves) {
        char[] chars = moves.toCharArray();
        int a = 0, b = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            switch (c) {
            case 'U':
                a++;
                break;
            case 'D':
                a--;
                break;
            case 'L':
                b++;
                break;

            case 'R':
                b--;
                break;

            default:
                break;
            }
        }
        return a == 0 && b == 0;
    }
}
// @lc code=end
