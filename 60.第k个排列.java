/*
 * @lc app=leetcode.cn id=60 lang=java
 *
 * [60] 第k个排列
 */

// @lc code=start
class Solution {
    boolean[] vis;
    // 表示这是第几个排列
    int now;
    StringBuilder temp;
    String res;

    public String getPermutation(int n, int k) {
        vis = new boolean[n + 1];
        now = 0;
        temp = new StringBuilder();
        process(0, n, k);
        return res;
    }

    public void process(int len, int n, int k) {
        if (len == n) {
            if (++now == k) {
                res = temp.toString();
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!vis[i]) {
                temp.append(i);
                vis[i] = true;
                process(len + 1, n, k);
                vis[i] = false;
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }
}
// @lc code=end
