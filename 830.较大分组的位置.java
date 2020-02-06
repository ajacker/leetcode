import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=830 lang=java
 *
 * [830] 较大分组的位置
 */

// @lc code=start
class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> res = new ArrayList<>();
        int i = 0, N = S.length();
        for (int j = 0; j < N; ++j) {
            if (j == N - 1 || S.charAt(j) != S.charAt(j + 1)) {
                if (j - i + 1 >= 3)
                    res.add(Arrays.asList(new Integer[] { i, j }));
                i = j + 1;
            }
        }
        return res;
    }
}
// @lc code=end
