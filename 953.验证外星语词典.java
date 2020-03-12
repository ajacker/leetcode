/*
 * @lc app=leetcode.cn id=953 lang=java
 *
 * [953] 验证外星语词典
 */

// @lc code=start
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        for (int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];
            int index = 0;
            while (index < word1.length() && index < word2.length()) {
                int priority1 = order.indexOf(word1.charAt(index));
                int priority2 = order.indexOf(word2.charAt(index));
                if (priority1 < priority2) {
                    break;
                }
                if (priority1 > priority2) {
                    return false;
                }
                index++;
            }
            //比较长短
            if (word1.length() > word2.length() && index == word2.length()) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

