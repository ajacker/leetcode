import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=929 lang=java
 *
 * [929] 独特的电子邮件地址
 */

// @lc code=start
class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> addresses = new HashSet<>();
        for (String email : emails) {
            String[] parts = email.split("@");
            String local = parts[0];
            String host = parts[1];
            if (local.contains("+")) {
                local = local.split("\\+")[0];
            }
            local = local.replaceAll("\\.", "");
            addresses.add(local + "@" + host);
        }
        return addresses.size();
    }
}
// @lc code=end
