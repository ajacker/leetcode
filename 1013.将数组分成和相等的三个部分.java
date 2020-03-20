import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1013 lang=java
 *
 * [1013] 将数组分成和相等的三个部分
 */

// @lc code=start
class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = Arrays.stream(A).sum();
        if (sum % 3 != 0) {
            // 总和不是3的倍数，肯定不能三等分
            return false;
        }
        int s = 0;
        // 标记有几个分组到了三等分
        int flag = 0;
        for (int i : A) {
            s += i;
            if (s == sum / 3) {
                flag++;
                s = 0;
            }
        }
        // 如果分组和是0，那么flag大于3也可以
        return flag == 3 || (s == 0 && flag >= 3);
    }
}
// @lc code=end
