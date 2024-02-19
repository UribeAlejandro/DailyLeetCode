package com.leetcode.selected;

import static java.lang.Math.abs;

public class TwoSum {

  public static int[] twoSumBruteForce(int[] nums, int target) {
    int[] result = new int[2];

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        int complement = target - nums[i];
        if (complement == nums[j]) {
          result[0] = i + 1;
          result[1] = j + 1;
          return result;
        }
      }
    }
    return result;
  }

  public static int[] twoSumTwoPointers(int[] numbers, int target) {
    int n = numbers.length;
    int pointer1 = 0;
    int pointer2 = n-1;
    int[] result = new int[2];

    while (pointer1 < pointer2) {
      int sum = numbers[pointer1] + numbers[pointer2];
      if (sum == target) {
        result[0] = pointer1 + 1;
        result[1] = pointer2 + 1;
        break;
      } else if (sum < target) {
        pointer1++;
      } else {
        pointer2--;
      }
    }
    return result;
  }

}
