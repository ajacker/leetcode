/*
 * @lc app=leetcode.cn id=1252 lang=java
 *
 * [1252] 奇数值单元格的数目
 */

// @lc code=start
class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int[][] arr = new int[n][m];
        for(int i = 0;i<indices.length;i++) {
            for(int j = 0;j<n;j++) {
                arr[j][indices[i][1]]+=1;
            }
            for(int k = 0;k<m;k++) {
                arr[indices[i][0]][k]+=1;
            }
        }
        int count = 0;
        for(int i = 0;i<n;i++) {
            for(int j = 0;j<m;j++) {
                if(arr[i][j]%2==1) count++;
            }
        }
        return count;
    }
}
// @lc code=end
