import java.util.Arrays;
import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=720 lang=java
 *
 * [720] 词典中最长的单词
 */

// @lc code=start
class Solution {
    public String longestWord(String[] words) {
        HashSet<String> wordset = new HashSet<>();
        for (String word : words){
            wordset.add(word);
        }
        Arrays.sort(words, (a, b) -> a.length() == b.length() ? a.compareTo(b) : b.length() - a.length());
        for (String word : words) {
            boolean good = true;
            for (int k = 1; k < word.length(); ++k) {
                if (!wordset.contains(word.substring(0, k))) {
                    good = false;
                    break;
                }
            }
            if (good)
                return word;
        }

        return "";
    }
}
// @lc code=end
