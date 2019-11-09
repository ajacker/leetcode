import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> temp = new ArrayList<>(Arrays.asList(new Integer[i]));
            // 填充第一个和最后一个为1
            temp.set(0,1);
            temp.set(i-1,1);
            //获取上一个元素
            List<Integer> prev = null;
            if(i>=2)
            prev = result.get(i-1-1);
            //填充其它元素
            for (int j = 1; j < i-1; j++) {
                temp.set(j, prev.get(j-1)+prev.get(j));
            }
            result.add(temp);
        }
        return result;
    }
}

