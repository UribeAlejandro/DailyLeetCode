package com.leetcode.level1.day2;

public class IsSubsequence {
  /*
  Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
  A subsequence of a string is a new string that is formed from the original string by deleting some
  (can be none) of the characters without disturbing the relative positions of the remaining
  characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
  */

  public static boolean IsSubsequence(String s, String t) {
    int n_s = s.length();
    int n_t = t.length();
    int longestSubSeq = 0;
    boolean isSubSeq = false;

    if (n_s > n_t) {
      return isSubSeq;
    } else if (n_s == 0) {
      return true;
    } else {
      for (int i = 0; i < n_t; i++) {
        if (longestSubSeq < n_s) {
          if (s.charAt(longestSubSeq) == t.charAt(i)) {
            longestSubSeq++;
          }

        }
      }
    }

    return longestSubSeq == n_s;
  }

}
