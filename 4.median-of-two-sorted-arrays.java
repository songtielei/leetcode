/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sum = new int[nums1.length + nums2.length];
        int current1 = 0;
        int current2 = 0;

        int i = 0;

        for (; i < sum.length; i++) {
            if (current1 == nums1.length) {
                sum[i] = nums2[current2];
                if (current2 < nums2.length) {
                    current2++;
                }
            } else if (current2 == nums2.length) {
                sum[i] = nums1[current1];
                if (current1 < nums1.length) {
                    current1++;
                }
            } else if (nums1[current1] < nums2[current2]) {
                sum[i] = nums1[current1];
                if (current1 < nums1.length) {
                    current1++;
                }

            } else if (nums1[current1] == nums2[current2]) {
                sum[i] = nums1[current1];
                if (current1 < nums1.length) {
                    current1++;
                }

            } else if (nums1[current1] > nums2[current2]) {
                sum[i] = nums2[current2];
                if (current2 < nums2.length) {
                    current2++;
                }
            }


            if ((current1 == nums1.length) && (current2 == nums2.length)) {
                break;
            }
        }
        i++;

        if (i % 2 != 0) {
            return sum[(i + 1) / 2 - 1];
        } else {
            return Double.valueOf((sum[i / 2 - 1] + sum[i / 2])) / 2.0;
        }
    }

}
// @lc code=end

