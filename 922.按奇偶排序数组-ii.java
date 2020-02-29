/*
 * @lc app=leetcode.cn id=922 lang=java
 *
 * [922] 按奇偶排序数组 II
 */

// @lc code=start
class Solution {
    public int[] sortArrayByParityII(int[] A) {
        // 指向奇数下标的指针
        int odd = 1;
        // 指向偶数下标的指针
        int even = 0;
        for (; even < A.length - 1; even += 2) {
            // 如果在偶数位置找到奇数，那么就是需要交换的
            if ((A[even] & 1) == 1) {
                // 基于以上，需要找到一个奇数下标且为偶数的元素进行交换
                while ((A[odd] & 1) == 1) {
                    odd += 2;
                }
                swap(A, even, odd);
            }
        }
        return A;
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
// @lc code=end
