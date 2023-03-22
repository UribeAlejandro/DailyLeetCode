package com.leetcode.level1.day5;

public class LongestPalindrome {

  public static int longestPalindrome(String s) {
    int[] count = new int[128];
    int longestpalindrome = 0;

    for (char c : s.toCharArray()) {
      count[c]++;
    }

    for (int v : count) {
      longestpalindrome += v / 2 * 2;
      if (longestpalindrome % 2 == 0 && v % 2 == 1) {
        longestpalindrome++;
      }
    }
    return longestpalindrome;
  }

}
