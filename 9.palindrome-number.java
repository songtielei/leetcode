/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int ans = 0;
        int origin = x;
        while(x != 0) {
            int pop = x % 10;
            ans = ans * 10 + pop;
            x = x / 10;
        }
        return ans == origin;
    }
}
// @lc code=end

