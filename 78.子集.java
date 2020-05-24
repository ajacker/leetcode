import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*
 * @lc app=leetcode.cn id=78 lang=java
 *
 * [78] 子集
 */

// @lc code=start
class Solution {
    List<List<Integer>> res;
    LinkedList<Integer> temp;

    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        temp = new LinkedList<>();
        process(0, 0, nums);
        return res;

    }

    public void process(int len, int prev, int[] nums) {
        res.add(new ArrayList<>(temp));
        for (int i = prev; i < nums.length; i++) {
            int n = nums[i];
            temp.addLast(n);
            process(len + 1, i + 1, nums);
            temp.removeLast();
        }
        if (len == nums.length) {
            return;
        }
    }
}
// @lc code=end
