import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=455 lang=java
 *
 * [455] 分发饼干
 */
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j=0;
        for (int i = 0; i < s.length; i++) {
            int cookie = s[i];
            if(j>=g.length) break;
            if(cookie>= g[j]){
                j++;
            }
        }
        return j;
    }
}

