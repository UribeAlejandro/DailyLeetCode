package com.leetcode.selected;

import static java.util.Arrays.sort;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RemoveElementTest {

  public static Stream<Arguments> RemoveElementTest() {
    return Stream.of(
        Arguments.of(new int[]{3, 2, 2, 3}, 3, new int[]{2, 2}, 2),
        Arguments.of(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, new int[]{0, 1, 4, 0, 3}, 5)
    );
  }

  @BeforeEach
  public void setUp() {
  }

  @MethodSource
  @ParameterizedTest
  public void RemoveElementTest(int[] nums, int val, int[] expectedNums, int expected) {
    int actual = RemoveElement.removeElement(nums, val);
    assertEquals(expected, actual);

    int[] actualNums = RemoveElement.removeElementNums(nums, val);
    sort(actualNums, 0, actual);
    sort(expectedNums);
    for (int i = 0; i < expectedNums.length; i++) {
      assertEquals(nums[i], expectedNums[i]);
    }
  }
}
