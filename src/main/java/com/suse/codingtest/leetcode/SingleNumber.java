package com.suse.codingtest.leetcode;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 */
public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            boolean duplicateFound = false;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    if (nums[i] == nums[j]) {
                        duplicateFound = true;
                        break;
                    }
                }
            }
            if (duplicateFound == false) {
                return nums[i];
            }
        }
        return -1;
    }
}
