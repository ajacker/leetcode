/*
 * @lc app=leetcode.cn id=38 lang=java
 *
 * [38] 报数
 */
class Solution {
    public String countAndSay(int n) {
        String start = "1";
        for (int i = 0; i < n-1; i++) {
            start = convert(start);
        }
        return start;
    }

    public String convert(String n) {
        StringBuilder sb = new StringBuilder(n);
        StringBuilder result = new StringBuilder();
        while (sb.length() != 0) {
            int amount = 0;
            char c = sb.charAt(0);
            char chr = c;
            while (sb.length() != 0 && c == sb.charAt(0)) {
                if (++amount < sb.length())
                    c = sb.charAt(amount);
                else break;
            }
            sb.delete(0, amount);
            result.append( (char) ('0' + amount)).append(chr);
        }
        return result.toString();
    }
}
