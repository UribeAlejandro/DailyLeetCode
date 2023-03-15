package com.leetcode.level1;

import static org.junit.jupiter.api.Assertions.*;

import com.leetcode.level1.utils.ListNode;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SplitLinkedListInPartsTest {

  private static Stream<Arguments> SplitLinkedListInPartsTest() {

    ListNode a = new ListNode(1, new ListNode(2, new ListNode(3)));
    ListNode b = new ListNode(
        1,
        new ListNode(2,
            new ListNode(3,
                new ListNode(4,
                    new ListNode(5,
                        new ListNode(6,
                            new ListNode(7,
                                new ListNode(8,
                                    new ListNode(9,
                                        new ListNode(10)
                                    )
                                )
                            )
                        )
                    )
                )
            )
        )
    );

    ListNode[] a_expected = new ListNode[]{
        new ListNode(1), new ListNode(2), new ListNode(3), new ListNode(), new ListNode()
    };
    ListNode[] b_expected = new ListNode[]{
        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))),
        new ListNode(5, new ListNode(6, new ListNode(7))),
        new ListNode(8, new ListNode(9, new ListNode(10)))
    };

    return Stream.of(
        Arguments.of(a, 5, a_expected),
        Arguments.of(b, 3, b_expected)
    );
  }

  @BeforeEach
  void setUp() {
  }

  @MethodSource
  @ParameterizedTest
  @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
  public void SplitLinkedListInPartsTest(ListNode head, int k, ListNode[] expected) {
    ListNode[] actual = SplitLinkedListInParts.splitListToParts(head, k);

    assertEquals(expected.length, actual.length);
    assertEquals(expected[0].val, actual[0].val);
  }
}