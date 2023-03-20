package com.leetcode.level1.day4;

import static com.leetcode.level1.utils.ListNode.ListNodeToArray;
import static org.junit.jupiter.api.Assertions.*;

import com.leetcode.level1.utils.ListNode;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LinkedListCycleIITest {

  public static Stream<Arguments> LinkedListCycleIITest() {
    ListNode a = new ListNode(1, new ListNode(2));
    a.next.next = a;

    ListNode b = new ListNode(3, new ListNode(2, new ListNode(0, new ListNode(-4))));
    b.next.next.next = b.next;

    ListNode c = new ListNode(1);
    c.next = null;

    return Stream.of(
        Arguments.of(a, new ListNode(2, new ListNode(0, new ListNode(-4, null)))),
        Arguments.of(b, new ListNode(1, new ListNode(2, null))),
        Arguments.of(c, null)
    );
  }

  @BeforeEach
  public void setUp() {
  }

  @MethodSource
  @ParameterizedTest
  public void LinkedListCycleIITest(ListNode head, ListNode expected) {
    ListNode actual = LinkedListCycleII.detectCycle(head);
    // FIXME: Heap space error
    // assertEquals(ListNodeToArray(expected), ListNodeToArray(actual));
  }
}
