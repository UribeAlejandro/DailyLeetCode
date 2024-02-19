package com.leetcode.selected;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ContainerWithMostWaterTest {

  public static Stream<Arguments> getSource() {
    return Stream.of(
        Arguments.of(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}, 49),
        Arguments.of(new int[]{1, 1}, 1),
        Arguments.of(new int[]{}, 0)
    );
  }

  @BeforeEach
  void setUp() {
  }

  @MethodSource("getSource")
  @ParameterizedTest
  void maxArea(int[] nums, int expected) {
    int actual = ContainerWithMostWater.maxArea(nums);
    assertEquals(expected, actual);
  }
}
