import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=119 lang=java
 *
 * [119] 杨辉三角 II
 */
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = null;
        for (int i = 1; i <= rowIndex+1; i++) {
            List<Integer> temp = new ArrayList<>(Arrays.asList(new Integer[i]));
            // 填充第一个和最后一个为1
            temp.set(0,1);
            temp.set(i-1,1);
            //填充其它元素
            for (int j = 1; j < i-1; j++) {
                temp.set(j, prev.get(j-1)+prev.get(j));
            }
            prev = temp;
            temp = null;
        }
        return prev;
    }
}

