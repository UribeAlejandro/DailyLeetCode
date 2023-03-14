package com.leetcode.level1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RunningSumOf1dArrayTest {

  private static Stream<Arguments> RunningSumOf1dArrayTest() {
    return Stream.of(
        Arguments.of(new int[]{1, 2, 3, 4}, new int[]{1, 3, 6, 10}),
        Arguments.of(new int[]{1, 1, 1, 1, 1}, new int[]{1, 2, 3, 4, 5}),
        Arguments.of(new int[]{3, 1, 2, 10, 1}, new int[]{3, 4, 6, 16, 17})
    );
  }

  @BeforeEach
  public void setUp() {
  }

  @MethodSource
  @ParameterizedTest
  @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
  public void RunningSumOf1dArrayTest(int[] nums, int[] expected) {
    int[] actual = RunningSumOf1dArray.runningSum(nums);
    System.out.println(Arrays.toString(actual));

    assertArrayEquals(expected, actual);
  }
}