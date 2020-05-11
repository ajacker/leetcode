/*
 * @lc app=leetcode.cn id=1071 lang=java
 *
 * [1071] 字符串的最大公因子
 */

// @lc code=start
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        String str = len1 > len2 ? str2 : str1;
        for (int len = str.length(); len > 0; len--) {
            if (len1 % len == 0 && len2 % len == 0) {
                // 长度满足条件，可能是公因子
                int r1 = len1 / len;
                int r2 = len2 / len;
                str = str.substring(0, len);
                // 判断是否为公因子
                if (repeat(str, r1).equals(str1) && repeat(str, r2).equals(str2)) {
                    return str;
                }
            }
        }
        return "";
    }

    public String repeat(String str, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
// @lc code=end
