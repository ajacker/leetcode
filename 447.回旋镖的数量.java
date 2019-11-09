import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=447 lang=java
 *
 * [447] 回旋镖的数量
 */
class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int count = 0;
        Map<Double,Integer> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            map.clear();
            for (int j = 0; j < points.length; j++) {
                if(j==i) continue;
                double len = getLen(points[i], points[j]);
                count += map.getOrDefault(len,0)*2;
                map.put(len,map.getOrDefault(len,0) + 1);
            }
        }
        return count;
    }
    public double getLen(int[] point1,int[] point2){
        int x1 = point1[0];
        int y1 = point1[1];
        int x2 = point2[0];
        int y2 = point2[1];
        return Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
    }
}

