/*
 * @lc app=leetcode.cn id=79 lang=java
 *
 * [79] 单词搜索
 */

// @lc code=start
class Solution {
    char[] target;
    boolean res;
    boolean[][] vis;
    int[][] dirs = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

    public boolean exist(char[][] board, String word) {
        target = word.toCharArray();
        vis = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                vis[i][j] = true;
                search(0, i, j, board);
                vis[i][j] = false;
            }
        }
        return res;
    }

    public void search(int curIndex, int i, int j, char[][] board) {
        if (res || board[i][j] != target[curIndex]) {
            // 已经有结果了或者不符合条件剪枝
            return;
        }
        if (curIndex == target.length - 1) {
            // 找到结果了
            res = true;
            return;
        }
        for (int k = 0; k < 4; k++) {
            int nextI = i + dirs[k][0];
            int nextJ = j + dirs[k][1];
            if (nextI >= 0 && nextI < board.length && nextJ >= 0 && nextJ < board[0].length && !vis[nextI][nextJ]) {
                vis[nextI][nextJ] = true;
                search(curIndex + 1, nextI, nextJ, board);
                vis[nextI][nextJ] = false;

            }
        }
    }
}
// @lc code=end
