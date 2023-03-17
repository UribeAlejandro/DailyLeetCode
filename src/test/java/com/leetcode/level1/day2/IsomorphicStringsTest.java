package com.leetcode.level1.day2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class IsomorphicStringsTest {

  public static Stream<Arguments> IsomorphicStringsTest() {
    return Stream.of(
        Arguments.of("egg", "add", true),
        Arguments.of("foo", "bar", false),
        Arguments.of("paper", "title", true),
        Arguments.of("bbbaaaba", "aaabbbba", false)
    );
  }

  @BeforeEach
  public void setUp() {
  }

  @MethodSource
  @ParameterizedTest
  @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
  public void IsomorphicStringsTest(String s, String t, boolean expected) {

    boolean actual = IsomorphicStrings.isIsomorphic(s, t);

    assertEquals(expected, actual);
  }


}