import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=682 lang=java
 *
 * [682] 棒球比赛
 */

// @lc code=start
class Solution {
    public int calPoints(String[] ops) {
        LinkedList<Integer> list = new LinkedList<>();
        for (String op : ops) {
            switch (op) {
            case "C":
                list.pollLast();
                break;
            case "D":
                list.addLast(list.peekLast() * 2);
                break;
            case "+":
                int temp = list.pollLast();
                int add = list.peekLast() + temp;
                list.addLast(temp);
                list.addLast(add);
                break;
            default:
                list.add(Integer.valueOf(op));
                break;
            }
        }
        return list.stream().reduce((a, b) -> a + b).get();

    }
}
// @lc code=end
