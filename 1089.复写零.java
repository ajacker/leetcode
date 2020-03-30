/*
 * @lc app=leetcode.cn id=1089 lang=java
 *
 * [1089] 复写零
 */

// @lc code=start
class Solution {
    public void duplicateZeros(int[] arr) {
        int[] temp = Arrays.copyOf(arr, arr.length);
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[index];
            //如果是0则多复制一个
            if (temp[index++] == 0 && i + 1 < arr.length) {
                arr[i + 1] = 0;
                i++;
            }
        }
    }
}
// @lc code=end
