/*
 * @lc app=leetcode.cn id=405 lang=java
 *
 * [405] 数字转换为十六进制数
 */
class Solution {
    public String toHex(int num) {
        if (num == 0)
            return "0";
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            int current = num & 0xf;
            num >>>= 4;
            if (current >= 10)
                sb.append((char) ('a' - 10 + current));
            else
                sb.append(current);
        }
        return sb.reverse().toString();
    }
}
