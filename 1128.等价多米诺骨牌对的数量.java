/*
 * @lc app=leetcode.cn id=1128 lang=java
 *
 * [1128] 等价多米诺骨牌对的数量
 */

// @lc code=start
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int ans = 0;
        //每一个对都可以通过排序后化为一个0-100的数字
        int[] cp = new int[100];
        for (int[] arr : dominoes) {
            Arrays.sort(arr);
            //如果之前出现过这个对就加1，并且自增1来记录当前出现过的对
            ans += cp[arr[0] * 10 + arr[1]]++;
        }
        return ans;
    }
}
// @lc code=end
