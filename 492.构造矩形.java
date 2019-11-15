/*
 * @lc app=leetcode.cn id=492 lang=java
 *
 * [492] 构造矩形
 */

// @lc code=start
class Solution {
    public int[] constructRectangle(int area) {
        int L = 0, W = 0;
        int s = (int) Math.sqrt(area);
        for (int i = s; i <= area; i++) {
            if (area % i == 0) {
                L = Integer.max(area / i, i);
                W = Integer.min(area / i, i);
                break;
            }
        }
        return new int[] { L, W };
    }
}
// @lc code=end
