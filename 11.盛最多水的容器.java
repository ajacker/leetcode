/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        while (l < r) {
            int h = Integer.min(height[l], height[r]);
            max = Integer.max(max, h * (r - l));
            //为什么移动高度小的那个，因为高度小的那个决定了容量，如果保持的话，容量没有大的可能了
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}
// @lc code=end
