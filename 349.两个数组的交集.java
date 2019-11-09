import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 */
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        set.retainAll(Arrays.stream(nums2).boxed().collect(Collectors.toList()));
        return set.stream().mapToInt(Integer::valueOf).toArray();
    }
}

