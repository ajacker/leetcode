/*
 * @lc app=leetcode.cn id=914 lang=java
 *
 * [914] 卡牌分组
 */

// @lc code=start
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        // deck数组长度最长10000，因此定义一个长度为10000的数组记录
        int[] an = new int[10000];
        // 通过遍历，记录各数字出现的次数
        for (int i = 0; i < deck.length; i++) {
            an[deck[i]]++;
        }
        // 确保x不为0，且为an数组中存在的数字
        int x = an[deck[0]];
        // 遍历数组，用x来记录原x与an[i]的最大公因数
        for (int i = 0; i < 10000; i++) {
            if (an[i] != 0)
                x = is(x, an[i]);
        }
        // 如果这个最大公因数大于2，则返回true
        return x >= 2;
    }

    // 求最大公因数，使用的是欧几里得算法，也叫辗转相除法。
    public int is(int a, int b) {
        while (a % b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return b;
    }
}
// @lc code=end
