/*
 * @lc app=leetcode.cn id=482 lang=java
 *
 * [482] 密钥格式化
 */

// @lc code=start
class Solution {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder sb = new StringBuilder();
        String str = S.replaceAll("-", "");
        char[] chars = str.toCharArray();
        int len = chars.length;
        for (int i = len - 1; i >= 0; i--) {
            sb.append(chars[i]);
            if (i > 0 && (len - i) % K == 0)
                sb.append("-");
        }
        return sb.reverse().toString().toUpperCase();
    }
}
// @lc code=end
