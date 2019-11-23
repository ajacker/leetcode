import java.util.ArrayList;
import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=599 lang=java
 *
 * [599] 两个列表的最小索引总和
 */

// @lc code=start
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        //记录Andy喜欢的餐厅的索引号
        HashMap<String, Integer> firstIndexes = new HashMap<>();
        ArrayList<String> both = new ArrayList<>();
        //记录最小索引和
        int minIndexSum = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            firstIndexes.put(list1[i], i);
        }

        for (int i = 0; i < list2.length; i++) {
            //发现相同喜好
            if (firstIndexes.containsKey(list2[i])) {
                //求得索引和
                int sum = firstIndexes.get(list2[i]) + i;
                if (sum == minIndexSum) {
                    //如果满足最小索引和就加入（题目所说的多个答案）
                    both.add(list2[i]);
                } else if (sum < minIndexSum) {
                    //如果能更新最小索引和就清空原先的在加入
                    minIndexSum = sum;
                    both.clear();
                    both.add(list2[i]);
                }
            }
        }
        return both.toArray(new String[0]);
    }
}
// @lc code=end
