/*
 * @lc app=leetcode.cn id=1184 lang=java
 *
 * [1184] 公交站间的距离
 */

// @lc code=start
class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start > destination) {
            return distanceBetweenBusStops(distance, destination, start);
        }
        int sum = 0, curSum = 0;
        for (int n : distance) {
            sum += n;
        }
        for (int i = start; i < destination; i++) {
            curSum += distance[i];
        }
        return Math.min(curSum, sum - curSum);
    }
}
// @lc code=end
