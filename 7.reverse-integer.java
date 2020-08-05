/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        int current = 0;
        while (x != 0) {
            int pop = x % 10;
            current = current * 10 + pop;
            x = x / 10;
        }
        return current;
    }
}
// @lc code=end

