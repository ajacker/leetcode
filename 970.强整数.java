import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=970 lang=java
 *
 * [970] 强整数
 */

// @lc code=start
class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        int iMax = x == 1 ? 0 : (int) (Math.log(bound - 1) / Math.log(x));
        int jMax = y == 1 ? 0 : (int) (Math.log(bound - 1) / Math.log(y));
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= iMax; i++) {
            for (int j = 0; j <= jMax; j++) {
                if (Math.pow(x, i) + Math.pow(y, j) <= bound) {
                    set.add((int) (Math.pow(x, i) + Math.pow(y, j)));
                } else
                    break;
            }
        }
        return new ArrayList<>(set);
    }
}
// @lc code=end
