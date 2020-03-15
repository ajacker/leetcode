/*
 * @lc app=leetcode.cn id=997 lang=java
 *
 * [997] 找到小镇的法官
 */

// @lc code=start
class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] trusts = new int[N + 1];
        int[] trusted = new int[N + 1];
        for (int i = 0; i < trust.length; i++) {
            int a = trust[i][0];
            int b = trust[i][1];
            trusts[a]++;
            trusted[b]++;
        }
        for (int i = 1; i <= N; i++) {
            if (trusts[i] == 0 && trusted[i] == N - 1) {
                return i;
            }
        }
        return -1;
    }
}
// @lc code=end
