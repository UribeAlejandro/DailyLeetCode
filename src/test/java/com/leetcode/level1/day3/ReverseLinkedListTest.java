package com.leetcode.level1.day3;

import static com.leetcode.utils.ListNode.ListNodeToArray;
import static org.junit.jupiter.api.Assertions.*;

import com.leetcode.utils.ListNode;
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
                            new ListNode(5, null)
                        )
                    )
                )
            ),
            new ListNode(5,
                new ListNode(4,
                    new ListNode(3,
                        new ListNode(2,
                            new ListNode(1, null)
                        )
                    )
                )
            )
        ),
        Arguments.of(
            new ListNode(1, new ListNode(2)),
            new ListNode(2, new ListNode(1, null))
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

    System.out.println(ListNodeToArray(expected));
    System.out.println(ListNodeToArray(actual));

    assertEquals(ListNodeToArray(expected), ListNodeToArray(actual));
  }

  @BeforeEach
  public void setUp() {
  }
}
