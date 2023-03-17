package com.leetcode.level1.day3;

import static com.leetcode.level1.utils.ListNode.iterateListNode;
import static org.junit.jupiter.api.Assertions.*;

import com.leetcode.level1.utils.ListNode;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ReverseLinkedListTest {

  public static Stream<Arguments> ReverseLinkedListTest() {
    return Stream.of(
        Arguments.of(
            new ListNode(1,
                new ListNode(2,
                    new ListNode(3,
                        new ListNode(4,
                            new ListNode(5)
                        )
                    )
                )
            ),
            new ListNode(5,
                new ListNode(4,
                    new ListNode(3,
                        new ListNode(2,
                            new ListNode(1)
                        )
                    )
                )
            )
        ),
        Arguments.of(
            new ListNode(1, new ListNode(2)),
            new ListNode(2, new ListNode(1))
        ),
        Arguments.of(
            new ListNode(),
            new ListNode()
        )
    );
  }

  @MethodSource
  @ParameterizedTest
  public void ReverseLinkedListTest(ListNode head, ListNode expected) {
    ListNode actual = ReverseLinkedList.reverseList(head);
    assertEquals(iterateListNode(expected), iterateListNode(actual));
  }

  @BeforeEach
  public void setUp() {
  }
}
