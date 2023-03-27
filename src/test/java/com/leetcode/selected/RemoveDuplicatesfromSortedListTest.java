package com.leetcode.selected;

import static com.leetcode.utils.ListNode.ListNodeToArray;
import static org.junit.jupiter.api.Assertions.*;

import com.leetcode.utils.ListNode;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RemoveDuplicatesfromSortedListTest {

  public static Stream<Arguments> RemoveDuplicatesfromSortedListTest() {
    return Stream.of(
        Arguments.of(
            new ListNode(1,
                new ListNode(1,
                    new ListNode(2)
                )
            ),
            new ListNode(1, new ListNode(2))
        ),
        Arguments.of(
            new ListNode(1,
                new ListNode(1,
                    new ListNode(2,
                        new ListNode(3,
                            new ListNode(3)
                        )
                    )
                )
            ),
            new ListNode(1, new ListNode(2, new ListNode(3)))
        )
    );
  }

  @BeforeEach
  public void setUp() {
  }

  @MethodSource
  @ParameterizedTest
  public void RemoveDuplicatesfromSortedListTest(ListNode head, ListNode expected) {
    ListNode actual = RemoveDuplicatesfromSortedList.deleteDuplicates(head);
    assertEquals(ListNodeToArray(expected), ListNodeToArray(actual));
  }
}
