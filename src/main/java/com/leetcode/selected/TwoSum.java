package com.leetcode.selected;

import static java.lang.Math.abs;

public class TwoSum {

  public static int[] twoSumBruteForce(int[] nums, int target) {

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        int complement = target - nums[i];
        if (complement == nums[j]) {
          return new int[]{i, j};
        }
      }
    }
    return new int[]{};
  }

  // TODO: Implement using hash table
//  public static int[] twoSum(int[] nums, int target) {
//    int curr;
//    int next = 1;
//
//    if (nums == null) {
//      return new int[]{};
//    }
//
//    return new int[]{};
//  }

}
