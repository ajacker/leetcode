/*
 * @lc app=leetcode.cn id=1021 lang=java
 *
 * [1021] 删除最外层的括号
 */

// @lc code=start
class Solution {
    public String removeOuterParentheses(String S) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int start = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                stack.push('(');
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    sb.append(S.substring(start + 1, i));
                    start = i + 1;
                }
            }
        }
        return sb.toString();
    }
}
// @lc code=end
