/*
 * @lc app=leetcode.cn id=961 lang=java
 *
 * [961] 重复 N 次的元素
 */

// @lc code=start
class Solution {
    public int repeatedNTimes(int[] A) {
        //定会出现连续的三个数，其中有两个数相等，也就是所要求的数
        int len = A.length;
        for (int i = 0; i < len - 2; i++) {
            if (A[i] == A[i+1] || A[i] == A[i+2]) {
                return A[i];
            }
        }
        //上面没找到就是最后一个
        return A[len - 1];
    }
}
// @lc code=end

