/*
 * @lc app=leetcode.cn id=55 lang=java
 *
 * [55] 跳跃游戏
 */

// @lc code=start
class Solution {
    // 记录从某个位置开始是否访问过
    boolean[] canReach;
    // 记录从某个位置开始是否能够访问到
    boolean[] visited;

    public boolean canJump(int[] nums) {
        canReach = new boolean[nums.length];
        visited = new boolean[nums.length];
        // 最后一个肯定可以跳到最后一个位置
        visited[nums.length - 1] = true;
        canReach[nums.length - 1] = true;
        // 尝试从各个位置跳(从右往左)
        for (int start = nums.length - 2; start >= 0; start--) {
            int furthestJump = Integer.min(start + nums[start], nums.length - 1);
            // 尝试跳跃不同的步长
            for (int j = start + 1; j <= furthestJump; j++) {
                // 如果能跳到的地方可达末尾，我也能！
                if (visited[j] && canReach[j]) {
                    visited[start] = true;
                    canReach[start] = true;
                    break;
                }
            }

        }
        return visited[0] && canReach[0];
    }

}
// @lc code=end
