import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=784 lang=java
 *
 * [784] 字母大小写全排列
 */

// @lc code=start
class Solution {
    List<String> ans = new ArrayList<>();

    public List<String> letterCasePermutation(String S) {
        char[] str = S.toCharArray();
        dfs(str, 0);
        return ans;
    }

    private void dfs(char[] str, int index) {
        if (index == str.length) {
            ans.add(new String(str));
            return;
        }
        if (Character.isLowerCase(str[index])) {
            dfs(str, index + 1);
            str[index] = Character.toUpperCase(str[index]);
            dfs(str, index + 1);
            str[index] = Character.toLowerCase(str[index]);
        } else if (Character.isUpperCase(str[index])) {
            dfs(str, index + 1);
            str[index] = Character.toLowerCase(str[index]);
            dfs(str, index + 1);
            str[index] = Character.toUpperCase(str[index]);
        } else {
            dfs(str, index + 1);
        }
        return;

    }
}
// @lc code=end
