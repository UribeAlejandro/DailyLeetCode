package com.leetcode.selected;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TwoSumTest {

  public static Stream<Arguments> getSource() {
    return Stream.of(
        Arguments.of(new int[]{-1, -2, -3, -4, -5}, -8, new int[]{3, 5}),
        Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{1, 2}),
        Arguments.of(new int[]{0, 4, 3, 0}, 0, new int[]{1, 4}),
        Arguments.of(new int[]{3, 2, 4}, 6, new int[]{2, 3}),
        Arguments.of(new int[]{3, 3}, 6, new int[]{1, 2}),
        Arguments.of(new int[]{1, 1}, 5, new int[2])
    );
  }

  @BeforeEach
  void setUp() {
  }

  @MethodSource("getSource")
  @ParameterizedTest
  public void TwoSumTest(int[] nums, int target, int[] expected) {
    int[] actual = TwoSum.twoSumBruteForce(nums, target);
    assertArrayEquals(expected, actual);
  }

  @MethodSource("getSource")
  @ParameterizedTest
  public void TwoSumTwoPointersTest(int[] nums, int target, int[] expected) {
    int[] actual = TwoSum.twoSumTwoPointers(nums, target);
    assertArrayEquals(expected, actual);
  }
}
