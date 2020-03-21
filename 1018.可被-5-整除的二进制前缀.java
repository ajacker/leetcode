import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=1018 lang=java
 *
 * [1018] 可被 5 整除的二进制前缀
 */

// @lc code=start
class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> res = new ArrayList<>();
        // 值管最后一位
        int tail = 0;
        for (int i : A) {
            tail = tail * 2 + i;
            tail = (tail > 9) ? tail - 10 : tail;
            if (tail == 0 || tail == 5) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }
}
// @lc code=end
