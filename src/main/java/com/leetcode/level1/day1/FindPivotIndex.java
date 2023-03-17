package com.leetcode.level1.day1;

public class FindPivotIndex {

  /*
  Given an array of integers nums, calculate the pivot index of this array.
  The pivot index is the index where the sum of all the numbers strictly to the left of the index
  is equal to the sum of all the numbers strictly to the index's right.
  If the index is on the left edge of the array, then the left sum is 0 because there are no
  elements to the left. This also applies to the right edge of the array.
  Return the leftmost pivot index. If no such index exists, return -1.
  */
  public static int calculateSum(int startIndex, int endIndex, int[] arr) {
    int sum = 0;
    for (int i = startIndex; i < endIndex; i++) {
      sum += arr[i];
    }
    return sum;
  }

  public static int pivotIndex(int[] nums) {
    int left;
    int right;
    int n = nums.length;
    int pivotIndex = -1;

    for (int i = 0; i < n; i++) {
      left = calculateSum(0, i, nums);
      right = calculateSum(i + 1, n, nums);

      if (left == right) {
        pivotIndex = i;
        return pivotIndex;
      }
    }
    return pivotIndex;
  }
}
