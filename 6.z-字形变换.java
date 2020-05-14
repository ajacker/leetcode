/*
 * @lc app=leetcode.cn id=6 lang=java
 *
 * [6] Z 字形变换
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }

        StringBuilder[] lines = new StringBuilder[numRows];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = new StringBuilder();
        }
        int flag = 1;
        int i = 0;
        int line = 0;
        while (i < s.length()) {
            lines[line].append(s.charAt(i++));
            // 到头了反转
            if (line + flag == -1 || line + flag == numRows) {
                flag = -flag;
            }
            line += flag;
        }
        StringBuilder res = new StringBuilder();
        for (int j = 0; j < lines.length; j++) {
            res.append(lines[j]);
        }
        return res.toString();
    }

}
// @lc code=end
