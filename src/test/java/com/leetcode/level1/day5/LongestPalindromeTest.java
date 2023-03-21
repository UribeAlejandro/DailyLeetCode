package com.leetcode.level1.day5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LongestPalindromeTest {

  public static Stream<Arguments> LongestPalindromeTest() {
    return Stream.of(
        Arguments.of("abccccdd", 7),
        Arguments.of("a", 1)
    );
  }

  @BeforeEach
  public void setUp() {
  }

  @MethodSource
  @ParameterizedTest
  public void LongestPalindromeTest(String s, int expected) {
    int actual = LongestPalindrome.longestPalindrome(s);
    assertEquals(expected, actual);
  }
}
