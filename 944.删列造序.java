/*
 * @lc app=leetcode.cn id=944 lang=java
 *
 * [944] 删列造序
 */

// @lc code=start
class Solution {
    public int minDeletionSize(String[] A) {
        int ans = 0;
        for (int c = 0; c < A[0].length(); ++c) {
            for (int r = 0; r < A.length - 1; ++r) {
                if (A[r].charAt(c) > A[r + 1].charAt(c)) {
                    //如果是降序，则删除
                    ans++;
                    break;
                }
            }
        }
        return ans;

    }
}
// @lc code=end
