/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if ( x < 0) {
            return false;
        }
        int temp = x;
        int aa = 0;
        while (temp != 0) {
            aa = aa * 10 + temp % 10;
            temp = temp / 10;
        }
        return aa == x;

    }
}
// @lc code=end

