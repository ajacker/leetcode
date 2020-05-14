import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=299 lang=java
 *
 * [299] 猜数字游戏
 */

// @lc code=start
class Solution {
    public String getHint(String secret, String guess) {
        char[] secretArray = secret.toCharArray();
        char[] guessArray = guess.toCharArray();
        int bulls = 0;
        int cows = 0;
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> gMap = new HashMap<>();
        for (int i = 0; i < guessArray.length; i++) {
            if (secretArray[i] == guessArray[i]) {
                bulls++;
            }
            sMap.put(secretArray[i], sMap.getOrDefault(secretArray[i], 0) + 1);
            gMap.put(guessArray[i], gMap.getOrDefault(guessArray[i], 0) + 1);
        }
        for (Character c : gMap.keySet()) {
            if (sMap.containsKey(c)) {
                cows += Integer.min(sMap.get(c), gMap.get(c));
            }
        }
        cows -= bulls;
        return bulls + "A" + cows + "B";
    }
}
// @lc code=end
