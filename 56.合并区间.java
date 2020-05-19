import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=56 lang=java
 *
 * [56] 合并区间
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        boolean[] disable = new boolean[intervals.length];
        Arrays.sort(intervals, (x, y) -> x[0] - y[0]);
        int newLen = intervals.length;
        for (int i = 0; i < intervals.length; i++) {
            if (disable[i]) {
                // 之前被合并过的就跳过
                continue;
            }
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[j][0] > intervals[i][1]) {
                    break;
                } else {
                    // 合并区间
                    intervals[i][1] = Math.max(intervals[i][1], intervals[j][1]);
                    disable[j] = true;
                    newLen--;
                }
            }
        }
        int[][] res = new int[newLen][2];
        int j = 0;
        for (int i = 0; i < intervals.length; i++) {
            if (!disable[i]) {
                res[j++] = intervals[i];
            }
        }
        return res;
    }
}
// @lc code=end
