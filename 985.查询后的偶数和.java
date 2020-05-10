/*
 * @lc app=leetcode.cn id=985 lang=java
 *
 * [985] 查询后的偶数和
 */

// @lc code=start
class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        // 代表了第i个元素是否为偶数
        boolean[] isEven = new boolean[A.length];
        // 保存每次计算结果
        int res = 0;
        // 初始化此数组
        for (int i = 0; i < isEven.length; i++) {
            if (A[i] % 2 == 0) {
                isEven[i] = true;
                res += A[i];
            }
        }
        // 结果数组
        int[] ans = new int[queries.length];
        // 进行查询
        for (int i = 0; i < queries.length; i++) {
            int val = queries[i][0];
            int index = queries[i][1];
            boolean flag = val % 2 == 0;
            if (isEven[index]) {
                if (flag) {
                    // 如果原先是偶数，加上偶数还是偶数，直接做修改
                    res += val;
                } else {
                    // 现在变成奇数，应该减去之前加的值
                    res -= A[index];
                }
            } else {
                if (flag) {
                    // 如果原先是奇数，加上偶数还是奇数，不会有任何改变
                } else {
                    // 如果原先是奇数，加上奇数变成偶数，加上最新值
                    res += A[index] + val;
                }
            }
            // 不论如何都要更新一下index内容，并保存结果
            A[index] += val;
            ans[i] = res;
            isEven[index] = !(isEven[index] ^ val % 2 == 0);
        }
        return ans;

    }
}
// @lc code=end
