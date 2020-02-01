import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=811 lang=java
 *
 * [811] 子域名访问计数
 */

// @lc code=start
class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> res = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for(String str:cpdomains){
            String[] parts = str.split(" ");
            int times = Integer.valueOf(parts[0]);
            String domain = parts[1];
            String[] dos = domain.split("\\.");
            for (int i = dos.length-1; i >=0; i--) {
                StringBuilder sb = new StringBuilder();
                for (int j = i; j < dos.length; j++){
                    sb.append(dos[j]);
                    if(j!=dos.length-1){
                        sb.append(".");
                    }
                }
                map.put(sb.toString(), map.getOrDefault(sb.toString(), 0)+times);
            }
        }
        Set<Map.Entry<String,Integer>> set = map.entrySet();
        for(Map.Entry<String,Integer> entry:set){
            res.add(entry.getValue()+" "+entry.getKey());
        }
        return res;
    }
}
// @lc code=end
