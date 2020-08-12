import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=89 lang=java
 *
 * [89] 格雷编码
 */

// @lc code=start
class Solution {
    public List<Integer> grayCode(int n) {
        if (n == 0) {
            return new ArrayList<>(Arrays.asList(0));
        }
        List<Integer> last = this.grayCode(n - 1);
        int size = last.size();
        for (int i = size - 1; i >= 0; i--) {
            int cur = last.get(i);
            last.add(cur ^ (1 << (n - 1)));
        }
        return last;
    }
}
// @lc code=end
