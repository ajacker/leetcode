import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> visted = new HashSet<>();
        visted.add(n);
        while (n != 1) {
            int temp = 0;
            while (n != 0) {
                temp += Math.pow(n % 10, 2);
                n /= 10;
            }
            System.out.println(temp);
            if (visted.contains(temp))
                return false;
            else visted.add(temp);
            n = temp;
        }
        return true;
    }
}
