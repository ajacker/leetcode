import java.util.ArrayList;
import java.util.List;
/*
 * @lc app=leetcode.cn id=39 lang=java
 *
 * [39] 组合总和
 */

// @lc code=start
class Solution {
    List<List<Integer>> res;
    List<Integer> temp;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new ArrayList<>();
        temp = new ArrayList<>();
        method(candidates, target, 0);
        return res;
    }

    public void method(int[] candidates, int target, int curSum) {
        // 判断是否满足条件
        if (curSum == target) {
            res.add(new ArrayList<>(temp));
        } else if (curSum > target) {
            // 剪枝
            return;
        }
        for (int i = 0; i < candidates.length; i++) {
            int cur = candidates[i];
            // 为了避免重复，只能非降序添加
            if (temp.size() == 0 || temp.get(temp.size() - 1) <= cur) {
                temp.add(cur);
                method(candidates, target, curSum + cur);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
// @lc code=end
