import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=1122 lang=java
 *
 * [1122] 数组的相对排序
 */

// @lc code=start
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for (int i = 0; i < arr1.length; i++) {
            count[arr1[i]]++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            int num = arr2[i];
            for (int j = 0; j < count[num]; j++) {
                list.add(num);
            }
            count[num] = 0;
        }
        for (int i = 0; i <= 1000; i++) {
            if (count[i] != 0) {
                for (int j = 0; j < count[i]; j++) {
                    list.add(i);
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
// @lc code=end
