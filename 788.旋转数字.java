import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=788 lang=java
 *
 * [788] 旋转数字
 */

// @lc code=start
class Solution {
    static HashMap<Character, Character> map = new HashMap<>();
    static {
        map.put('0', '0');
        map.put('1', '1');
        map.put('2', '5');
        map.put('5', '2');
        map.put('6', '9');
        map.put('9', '6');
        map.put('8', '8');
    }

    public int rotatedDigits(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (judge(i)) {
                count++;
            }
        }
        return count;
    }

    boolean judge(int N) {
        char[] chars = String.valueOf(N).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                chars[i] = map.get(chars[i]);
            }else{
                return false;
            }
        }
        return N != Integer.valueOf(new String(chars)).intValue();
    }
}
// @lc code=end
