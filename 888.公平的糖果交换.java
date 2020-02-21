/*
 * @lc app=leetcode.cn id=888 lang=java
 *
 * [888] 公平的糖果交换
 */

// @lc code=start
class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0, sumB = 0;
        for (int i : A) {
            sumA += i;
        }
        for (int i : B) {
            sumB += i;
        }
        int delta = (sumB - sumA) / 2;
        // 将B有的大小添加到集合
        Set<Integer> setB = new HashSet();
        for (int i : B) {
            setB.add(i);
        }
        //检查A有的糖果能否和B的刚好交换
        for (int i : A) {
            if (setB.contains(i + delta)) {
                return new int[] { i, i + delta };
            }
        }
        return null;
    }
}
// @lc code=end
