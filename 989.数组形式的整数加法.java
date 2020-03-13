/*
 * @lc app=leetcode.cn id=989 lang=java
 *
 * [989] 数组形式的整数加法
 */

// @lc code=start
class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        LinkedList<Integer> res = new LinkedList<>();
        for(int i = A.length-1 ; i >= 0 || K > 0 ; i--){
            if(i >= 0)
                K += A[i]; 
            res.addFirst(K % 10);
            K = K/10; 
        }
        return res;

    }
}
// @lc code=end

