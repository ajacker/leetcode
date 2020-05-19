import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/*
 * @lc app=leetcode.cn id=47 lang=java
 *
 * [47] 全排列 II
 */

// @lc code=start
class Solution {
    List<List<Integer>> res;
    List<Integer> temp;
    boolean[] visited;

    public List<List<Integer>> permuteUnique(int[] nums) {
        res = new ArrayList<>();
        temp = new ArrayList<>();
        visited = new boolean[nums.length];
        process(nums, 0);
        return res;
    }

    public void process(int[] arr, int used) {
        if (used == arr.length) {
            res.add(new ArrayList(temp));
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (!visited[i] && !set.contains(num)) {
                set.add(num);
                temp.add(num);
                visited[i] = true;
                process(arr, used + 1);
                visited[i] = false;
                temp.remove(temp.size() - 1);
            }

        }
    }
}
// @lc code=end
