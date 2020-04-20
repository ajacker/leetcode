/*
 * @lc app=leetcode.cn id=1033 lang=java
 *
 * [1033] 移动石子直到连续
 */

// @lc code=start
class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int[] res = new int[2];
        int[] array = {a, b, c};
        //先排序
        Arrays.sort(array);
        //两数相差大于1，就直接挪到中间数旁边，需要一次；两数挨着，就不动
        res[0] = (array[1] - array[0] == 1 ? 0 : 1) + (array[2] - array[1] == 1 ? 0 : 1);
        //两数相差等于2，就直接把另一个数挪中间
        res[0] = (array[1] - array[0] == 2 || array[2] - array[1] == 2) ? 1 : res[0];
        //最大值就是两边距离
        res[1] = array[2] - array[0] - 2;

        return res;
    }
}
// @lc code=end

