/*
 * @lc app=leetcode.cn id=849 lang=java
 *
 * [849] 到最近的人的最大距离
 */

// @lc code=start
class Solution {
    public int maxDistToClosest(int[] seats) {
        int dis = 0;
        int[] distances = new int[seats.length];
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                int j = 1;
                while (i + j < seats.length || i - j >= 0) {
                    if (i + j < seats.length) {
                        if (seats[i + j] == 1) {
                            distances[i + j] = Math.max(j, distances[i + j]);
                            if (distances[i + j] > dis) {
                                dis = distances[i + j];
                            }
                            break;
                        }
                    }
                    if (i - j >= 0) {
                        if (seats[i - j] == 1) {
                            distances[i - j] = Math.max(j, distances[i - j]);
                            if (distances[i - j] > dis) {
                                dis = distances[i - j];
                            }
                            break;
                        }
                    }
                    j++;
                }
            }
        }
        return dis;
    }
}
// @lc code=end
