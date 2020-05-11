import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1030 lang=java
 *
 * [1030] 距离顺序排列矩阵单元格
 */

// @lc code=start
class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] res = new int[R * C][2];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                res[i * C + j][0] = i;
                res[i * C + j][1] = j;
            }
        }
        Arrays.sort(res, (arr1, arr2) -> {
            int i1 = arr1[0];
            int j1 = arr1[1];
            int i2 = arr2[0];
            int j2 = arr2[1];
            int val1 = abs(i1 - r0) + abs(j1 - c0);
            int val2 = abs(i2 - r0) + abs(j2 - c0);
            return val1 - val2;
        });
        return res;
    }

    private int abs(int i) {
        return i >= 0 ? i : -i;
    }
}
// @lc code=end
