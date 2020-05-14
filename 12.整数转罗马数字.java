/*
 * @lc app=leetcode.cn id=12 lang=java
 *
 * [12] 整数转罗马数字
 */

// @lc code=start
class Solution {
    static Object[][] info = new Object[][] { 
        { 1000, "M" }, 
        { 900, "CM" }, 
        { 500, "D" }, 
        { 400, "CD" }, 
        { 100, "C" },
        { 90, "XC" }, 
        { 50, "L" }, 
        { 40, "XL" }, 
        { 10, "X" }, 
        { 9, "IX" }, 
        { 5, "V" }, 
        { 4, "IV" }, 
        { 1, "I" } };

    public String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        while (num > 0) {
            int n = (Integer) info[i][0];
            String s = (String) info[i][1];
            while (num - n >= 0) {
                num -= n;
                res.append(s);
            }
            i++;
        }
        return res.toString();
    }
}
// @lc code=end
