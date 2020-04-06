/*
 * @lc app=leetcode.cn id=1160 lang=java
 *
 * [1160] 拼写单词
 */

// @lc code=start
class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charsOfCase = new int[26];
        int count = 0;
        // 统计每个字母出现的次数
        for (char c : chars.toCharArray()) {
            charsOfCase[c - 'a']++;
        }
        // 计算掌握的单词
        for (String str : words) {
            int[] temp = new int[26];
            boolean flag = true;
            for (char c : str.toCharArray()) {
                temp[c - 'a']++;
            }
            for (int i = 0; i < charsOfCase.length; i++) {
                if (temp[i] > charsOfCase[i]) {
                    flag = false;
                    break;
                }
            }
            // 如果掌握就添加长度
            if (flag) {
                count += str.length();
            }

        }
        return count;
    }
}
// @lc code=end
