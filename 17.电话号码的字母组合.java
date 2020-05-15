import java.util.ArrayList;
import java.util.List;
/*
 * @lc app=leetcode.cn id=17 lang=java
 *
 * [17] 电话号码的字母组合
 */

// @lc code=start
class Solution {
    private String letterMap[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    private ArrayList<String> res;
    private StringBuilder sb;

    public List<String> letterCombinations(String digits) {

        res = new ArrayList<String>();
        sb = new StringBuilder();
        if (digits.equals(""))
            return res;
        findCombination(digits, 0);
        return res;
    }

    private void findCombination(String digits, int index) {
        // 组合完毕后添加到结果
        if (index == digits.length()) {
            res.add(sb.toString());
            return;
        }

        char c = digits.charAt(index);
        String letters = letterMap[c - '0'];
        for (int i = 0; i < letters.length(); i++) {
            sb.append(letters.charAt(i));
            findCombination(digits, index + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

}
// @lc code=end
