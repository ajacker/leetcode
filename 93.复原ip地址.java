import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=93 lang=java
 *
 * [93] 复原IP地址
 */

// @lc code=start
class Solution {
    public List<String> res;

    public List<String> restoreIpAddresses(String s) {
        res = new ArrayList<>();
        StringBuilder sb = new StringBuilder(s);
        backtrack(sb, 0, 1);
        return res;
    }

    private void backtrack(StringBuilder sb, int start, int depth) {
        if (depth == 4) {
            String curr = sb.substring(start).toString();
            //去除前导0
            if (curr.startsWith("0") && curr.length() > 1 || curr.length() > 3) {
                return;
            }
            int num = Integer.parseInt(curr);
            if (num >= 0 && num <= 255) {
                res.add(sb.toString());
            }
            return;
        }
        int end = Math.min(sb.length(), start + 4);
        for (int i = start + 1; i < end; i++) {
            sb.insert(i, ".");
            //判断数是否合法
            String curr = sb.substring(start, i).toString();
            //去除前导0
            if (curr.startsWith("0") && curr.length() > 1) {
                sb.deleteCharAt(i);
                continue;
            }
            int num = Integer.parseInt(curr);
            if (num >= 0 && num <= 255) {
                backtrack(sb, i + 1, depth + 1);
            }
            sb.deleteCharAt(i);
        }
    }
}
// @lc code=end
