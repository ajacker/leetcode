import java.util.ArrayList;
import java.util.List;
/*
 * @lc app=leetcode.cn id=77 lang=java
 *
 * [77] 组合
 */

// @lc code=start
class Solution {
    List<List<Integer>> res;
    List<Integer> temp;

    public List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<>();
        temp = new ArrayList<>();
        process(n, k, 0, 1);
        return res;
    }

    public void process(int n, int k, int len, int prev) {
        if (len == k) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = prev; i <= n; i++) {
            temp.add(i);
            process(n, k, len + 1, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
// @lc code=end
