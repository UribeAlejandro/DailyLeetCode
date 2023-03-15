package com.leetcode.level1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class IsSubsequenceTest {

  public static Stream<Arguments> IsSubsequenceTest() {
    return Stream.of(
        Arguments.of("", "abc", true),
        Arguments.of("b", "abc", true),
        Arguments.of("abc", "ahbgdc", true),
        Arguments.of("axc", "ahbgdc", false)
    );
  }

  @BeforeEach
  public void setUp() {
  }

  @MethodSource
  @ParameterizedTest
  @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
  public void IsSubsequenceTest(String s, String t, boolean expected) {
    boolean actual = IsSubsequence.IsSubsequence(s, t);
    assertEquals(expected, actual);
  }
}