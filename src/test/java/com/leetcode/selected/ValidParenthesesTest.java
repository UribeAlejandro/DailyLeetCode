package com.leetcode.selected;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@TestInstance(Lifecycle.PER_CLASS)
class ValidParenthesesTest {
  public static Stream<Arguments> isValid() {
    return Stream.of(
        Arguments.of("()", true),
        Arguments.of("()[]{}", true),
        Arguments.of("[}", false),
        Arguments.of("(]", false),
        Arguments.of("", true),
        Arguments.of(")", false),
        Arguments.of("{[]}", true),
        Arguments.of("[", false),
        Arguments.of("[[", false)
    );
  }

  @BeforeEach
  void setUp() {
  }

  @MethodSource
  @ParameterizedTest
  public void isValid(String s, boolean expected) {
    boolean actual = ValidParentheses.isValid(s);
    assertEquals(expected, actual);
  }
}
