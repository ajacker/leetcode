import java.util.Stack;

/*
 * @lc app=leetcode.cn id=733 lang=java
 *
 * [733] 图像渲染
 */

// @lc code=start
class Solution {
    static int[][] dirs = new int[][] { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if (oldColor != newColor) {
            Stack<Integer> stack = new Stack<>();
            stack.push(sc);
            stack.push(sr);
            while (!stack.isEmpty()) {
                int x = stack.pop();
                int y = stack.pop();
                image[x][y] = newColor;
                for (int i = 0; i < dirs.length; i++) {
                    int newX = x + dirs[i][0];
                    int newY = y + dirs[i][1];
                    if (newX >= 0 && newX < image.length && newY >= 0 && newY < image[0].length) {
                        if (image[newX][newY] == oldColor) {
                            stack.push(newY);
                            stack.push(newX);
                        }
                    }
                }
            }
        }
        return image;
    }
}
// @lc code=end
