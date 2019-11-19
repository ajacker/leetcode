/*
 * @lc app=leetcode.cn id=55 lang=java
 *
 * [55] 跳跃游戏
 */

// @lc code=start
class Solution {
    //记录从某个位置开始是否访问过
    boolean[] canReach;
    //记录从某个位置开始是否能够访问到
    boolean[] visited;

    public boolean canJump(int[] nums) {
        if (nums.length == 0) {
            return false;
        } else {
            canReach = new boolean[nums.length];
            visited = new boolean[nums.length];
            return canJump(nums, 0);
        }
    }

    public boolean canJump(int[] nums, int start) {
        if (visited[start])
            return canReach[start];
        else
            visited[start] = true;
        if (start == nums.length - 1) {
            canReach[start] = true;
            return true;
        }
        int cur = nums[start];
        boolean flag = false;
        // 尝试跳每一种跳法
        for (int i = cur; i >= 1; i--) {
            if (start + i < nums.length) {
                flag = flag || canJump(nums, start + i);
            }
        }
        return canReach[start] = flag;
    }
}
// @lc code=end
