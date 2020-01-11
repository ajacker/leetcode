
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=697 lang=java
 *
 * [697] 数组的度
 */

// @lc code=start
class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> start = new HashMap<>();
        HashMap<Integer, Integer> end = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            map.put(cur, map.getOrDefault(cur, 0) + 1);
            start.putIfAbsent(cur, i);
            end.put(cur, i);
        }
        Map.Entry<Integer, Integer> res = map.entrySet().stream().max((a, b) -> {
            int ka = a.getKey();
            int kb = b.getKey();
            int va = a.getValue();
            int vb = b.getValue();
            if (va == vb) {
                int la = end.getOrDefault(ka, -1) - start.getOrDefault(ka, 0) + 1;
                int lb = end.getOrDefault(kb, -1) - start.getOrDefault(kb, 0) + 1;
                return lb - la;
            } else {
                return va - vb;
            }
        }).get();
        return end.getOrDefault(res.getKey(), -1) - start.getOrDefault(res.getKey(), 0) + 1;

    }
}
// @lc code=end
