package com.leetcode.level1.day5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BestTimetoBuyandSellStockTest {

  public static Stream<Arguments> BestTimetoBuyandSellStockTest() {
    return Stream.of(
        Arguments.of(new int[]{}, 0),
        Arguments.of(new int[]{-1}, 0),
        Arguments.of(new int[]{1, 2}, 1),
        Arguments.of(new int[]{1, -2}, 0),
        Arguments.of(new int[]{7, 1, 5, 3, 6, 4}, 5),
        Arguments.of(new int[]{7, 6, 4, 3, 2, 1}, 0)
    );
  }

  @BeforeEach
  public void setUp() {
  }

  @MethodSource
  @ParameterizedTest
  public void BestTimetoBuyandSellStockTest(int[] prices, int expected) {
    int actual = BestTimetoBuyandSellStock.maxProfit(prices);
    assertEquals(expected, actual);
  }
}
