import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=703 lang=java
 *
 * [703] 数据流中的第K大元素
 */

// @lc code=start
class KthLargest {
    int size;
    private PriorityQueue<Integer> q;

    public KthLargest(int k, int[] nums) {
        size = k;
        q = new PriorityQueue<>(k);
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        // 维护的队列头就是第k个最大的元素
        if (q.size() < size) {
            q.add(val);
        } else if (q.peek() < val) {
            q.poll();
            q.add(val);
        }
        return q.peek();
    }

}

/**
 * Your KthLargest object will be instantiated and called as such: KthLargest
 * obj = new KthLargest(k, nums); int param_1 = obj.add(val);
 */
// @lc code=end
