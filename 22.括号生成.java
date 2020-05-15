import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

// @lc code=start
class Solution {
    StringBuilder sb;
    List<String> res;

    public List<String> generateParenthesis(int n) {
        // 特判
        if (n == 0) {
            return res;
        }
        sb = new StringBuilder();
        res = new ArrayList<>();
        // 执行深度优先遍历，搜索可能的结果
        dfs(n, n);
        return res;
    }

    /**
     * @param left  左括号还有几个可以使用
     * @param right 右括号还有几个可以使用
     */
    private void dfs(int left, int right) {
        // 因为每一次尝试，都使用新的字符串变量，所以无需回溯
        if (left == 0 && right == 0) {
            res.add(sb.toString());
            return;
        }
        // 剪枝，如果现在右括号用的比较多，那么字符串不可能有效（因为从左往右）
        if (left > right) {
            return;
        }

        // 如果有左括号，则添加左括号
        if (left > 0) {
            sb.append("(");
            dfs(left - 1, right);
            sb.deleteCharAt(sb.length() - 1);
        }
        // 如果有右括号，则添加右括号
        if (right > 0) {
            sb.append(")");
            dfs(left, right - 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
// @lc code=end
