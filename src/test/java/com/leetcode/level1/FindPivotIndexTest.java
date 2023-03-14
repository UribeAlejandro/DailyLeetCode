package com.leetcode.level1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FindPivotIndexTest {

  private static Stream<Arguments> FindPivotIndexTest() {
    return Stream.of(
        Arguments.of(new int[]{1, 7, 3, 6, 5, 6}, 3),
        Arguments.of(new int[]{1, 2, 3}, -1),
        Arguments.of(new int[]{2, 1, -1}, 0),
        Arguments.of(new int[]{-1, -1, 0, 0, -1, -1}, 2)
    );
  }

  @BeforeEach
  void setUp() {
  }

  @MethodSource
  @ParameterizedTest
  @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
  public void FindPivotIndexTest(int[] nums, int expected) {
    int actual = FindPivotIndex.pivotIndex(nums);

    assertEquals(expected, actual);
  }
}