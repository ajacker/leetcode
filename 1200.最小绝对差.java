/*
 * @lc app=leetcode.cn id=1200 lang=java
 *
 * [1200] 最小绝对差
 */

// @lc code=start
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List list = new ArrayList();
        Arrays.sort(arr);
        int min = arr[1] - arr[0];
        //排序后找出最小绝对差
        for (int i = 0; i < arr.length - 1; i++) {
            int result = arr[i + 1] - arr[i];
            if (result < min) {
                min = result;
            }
        }
        //找到具有最小绝对差的元素对
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == min) {
                list.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return list;
    }

}
// @lc code=end
