/*
 * @lc app=leetcode.cn id=441 lang=java
 *
 * [441] 排列硬币
 */
class Solution {
    public int arrangeCoins(int n) {
        int l = 0, r = n;
        while (l < r) {
            int mid = l + r + 1 >>> 1;
            if (1L * mid * (mid + 1) >>> 1 <= n) l = mid;
            else r = mid - 1;
        }
        return r;
    }
}
