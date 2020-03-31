/*
 * @lc app=leetcode.cn id=1078 lang=java
 *
 * [1078] Bigram 分词
 */

// @lc code=start
class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] word = text.split("\\s");
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < word.length - 2; i++)
            if (word[i].equals(first) && word[i + 1].equals(second))
                list.add(word[i + 2]);
        return list.toArray(new String[0]);
    }
}
// @lc code=end
