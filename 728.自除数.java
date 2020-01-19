import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=728 lang=java
 *
 * [728] 自除数
 */

// @lc code=start
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (judge(i)) {
                list.add(i);
            }
        }
        return list;
    }

    static boolean judge(int i) {
        int num = i;
        boolean flag = true;
        while (i > 0) {
            int cur = i % 10;
            if(cur==0){
                return false;
            }
            i /= 10;
            flag &= num % cur == 0;
            
        }
        return flag;
    }
}
// @lc code=end
