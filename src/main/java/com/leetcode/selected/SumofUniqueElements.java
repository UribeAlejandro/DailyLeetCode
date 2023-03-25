package com.leetcode.selected;

import java.util.HashMap;

public class SumofUniqueElements {

  /*
  You are given an integer array nums. The unique elements of an array are the elements that
  appear exactly once in the array.

  Return the sum of all the unique elements of nums.
  */
  public static int sumOfUnique(int[] nums) {
    int sumUniqueNums = 0;
    HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();

    for (int num : nums) {
      if (freq.containsKey(num)) {
        freq.merge(num, 1, Integer::sum);
      } else {
        freq.put(num, 1);
      }
    }

    for (int key : freq.keySet()) {
      if (freq.get(key) == 1) {
        sumUniqueNums += key;
      }
    }

    return sumUniqueNums;
  }
}
