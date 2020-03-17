/*
 * @lc app=leetcode.cn id=1005 lang=java
 *
 * [1005] K 次取反后最大化的数组和
 */

// @lc code=start
class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        int[] number = new int[201];
        for (int t : A) {
            number[t + 100]++;
        }
        int i = 0;
        while (K > 0) {
            while (number[i] == 0)
                i++;
            number[i]--;
            number[200 - i]++;
            if (i > 100) {
                i = 200 - i;
            }
            K--;
        }
        int sum = 0;
        for (int j = i; j < number.length; j++) {
            sum += (j - 100) * number[j];
        }
        return sum;

    }
}
// @lc code=end
