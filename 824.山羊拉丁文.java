/*
 * @lc app=leetcode.cn id=824 lang=java
 *
 * [824] 山羊拉丁文
 */

// @lc code=start
class Solution {
    public String toGoatLatin(String S) {
        String[] words = S.split(" ");
        String[] res = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder sb = new StringBuilder(word);
            switch (Character.toLowerCase(word.charAt(0))) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                sb.append("ma");
                break;
            default:
                char c = sb.charAt(0);
                sb.deleteCharAt(0);
                sb.append(c).append("ma");
                break;
            }
            for (int j = 0; j <= i; j++) {
                sb.append("a");
            }
            res[i] = sb.toString();
        }
        return String.join(" ", res);
    }
}
// @lc code=end
