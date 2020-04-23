/*
 * @lc app=leetcode.cn id=1042 lang=java
 *
 * [1042] 不邻接植花
 */

// @lc code=start
class Solution {
    public int[] gardenNoAdj(int N, int[][] paths) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        // 使用邻接表
        for (int i = 0; i < N; i++) {
            graph.put(i, new HashSet<>());
        }
        // 初始化邻接表
        for (int[] path : paths) {
            int a = path[0] - 1;
            int b = path[1] - 1;
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        int[] res = new int[N];
        for (int i = 0; i < N; i++) {
            boolean[] used = new boolean[5];
            // 当前节点所有相邻的颜色都不能够使用
            for (int adj : graph.get(i)) {
                used[res[adj]] = true;
            }
            // 为当前节点染色
            for (int j = 1; j <= 4; j++) {
                if (!used[j]) {
                    res[i] = j;
                }
            }
        }
        return res;

    }
}
// @lc code=end
