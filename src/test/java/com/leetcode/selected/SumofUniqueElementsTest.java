package com.leetcode.selected;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SumofUniqueElementsTest {

  public static Stream<Arguments> SumofUniqueElementsTest() {
    return Stream.of(
        Arguments.of(new int[]{}, 0),
        Arguments.of(new int[]{0}, 0),
        Arguments.of(new int[]{1}, 1),
        Arguments.of(new int[]{1, 2, 3, 2}, 4),
        Arguments.of(new int[]{1, 1, 1, 1, 1}, 0),
        Arguments.of(new int[]{1, 2, 3, 4, 5}, 15)
    );
  }

  @BeforeEach
  public void setUp() {
  }

  @MethodSource
  @ParameterizedTest
  public void SumofUniqueElementsTest(int[] nums, int expected) {
    int actual = SumofUniqueElements.sumOfUnique(nums);
    assertEquals(expected, actual);
  }
}
