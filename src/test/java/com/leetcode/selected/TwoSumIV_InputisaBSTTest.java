package com.leetcode.selected;

import static org.junit.jupiter.api.Assertions.*;

import com.leetcode.utils.TreeNode;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TwoSumIV_InputisaBSTTest {

  public static Stream<Arguments> TwoSumIV_InputisaBSTTest() {
    return Stream.of(
        Arguments.of(null, 0, false),
        Arguments.of(new TreeNode(), 0, false),
        Arguments.of(
            new TreeNode(5,
                new TreeNode(3, new TreeNode(2), new TreeNode(4)),
                new TreeNode(6, null, new TreeNode(7))),
            9, true
        ),
        Arguments.of(
            new TreeNode(5,
                new TreeNode(3, new TreeNode(2), new TreeNode(4)),
                new TreeNode(6, null, new TreeNode(7))),
            28, false
        ),
        Arguments.of(
            new TreeNode(5,
                new TreeNode(3, new TreeNode(2), new TreeNode(4)),
                new TreeNode(6, null, new TreeNode(7))),
            -1, false
        )
    );
  }

  @BeforeEach
  public void setUp() {
  }

  @MethodSource
  @ParameterizedTest
  public void TwoSumIV_InputisaBSTTest(TreeNode root, int k, boolean expected) {
    boolean actual = TwoSumIV_InputisaBST.findTarget(root, k);
    assertEquals(expected, actual);
  }
}
