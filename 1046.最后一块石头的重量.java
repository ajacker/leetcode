import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/*
 * @lc app=leetcode.cn id=1046 lang=java
 *
 * [1046] 最后一块石头的重量
 */

// @lc code=start
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        queue.addAll(Arrays.stream(stones).boxed().collect(Collectors.toList()));
        while (queue.size() > 1) {
            int a = queue.poll();
            int b = queue.poll();
            if (a != b) {
                queue.offer(a - b);
            }
        }
        return queue.size() != 0 ? queue.poll() : 0;
    }
}
// @lc code=end
