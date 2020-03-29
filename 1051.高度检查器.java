/*
 * @lc app=leetcode.cn id=1051 lang=java
 *
 * [1051] 高度检查器
 */

// @lc code=start
class Solution {
    public int heightChecker(int[] heights) {
        int[] arr = new int[101];
        // 记录每种高度有多少个
        for (int height : heights) {
            arr[height]++;
        }
        int count = 0;
        // 按照高度从低到高从中取出来
        for (int i = 1, j = 0; i < arr.length; i++) {
            // 如果还有这个高度的学生就取出来
            while (arr[i]-- > 0) {
                // 比较实际序列上的高度是否和期望序列的一致
                if (heights[j++] != i)
                    count++;
            }
        }
        return count;

    }
}
// @lc code=end
