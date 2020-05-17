import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * @lc app=leetcode.cn id=40 lang=java
 *
 * [40] 组合总和 II
 */

// @lc code=start
class Solution {
    List<List<Integer>> res;
    List<Integer> temp;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        temp = new ArrayList<>();
        Arrays.sort(candidates);
        method(candidates, target, 0, 0);
        return res;
    }

    public void method(int[] candidates, int target, int curSum, int curIndex) {
        // 判断是否满足条件
        if (curSum == target) {
            res.add(new ArrayList<>(temp));
        } else if (curSum > target) {
            // 剪枝
            return;
        }
        for (int i = curIndex; i < candidates.length; i++) {
            int cur = candidates[i];
            temp.add(cur);
            method(candidates, target, curSum + cur, i + 1);
            temp.remove(temp.size() - 1);
            // 跳过连续相等的的，避免重复 比如： 1 1 2 5 6 7 10，第一个1用一次就好
            while (i + 1 < candidates.length && candidates[i] == candidates[i + 1]) {
                i++;
            }
        }
    }
}
// @lc code=end
