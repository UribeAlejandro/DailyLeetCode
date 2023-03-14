package com.leetcode.level1;

public class RunningSumOf1dArray {
  /*
  Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
  Return the running sum of nums.
  */

  public static int[] runningSum(int[] nums) {
    for (int i = 1; i < nums.length; i++) {
      nums[i] = nums[i - 1] + nums[i];
    }
    return nums;
  }
}
