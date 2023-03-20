package com.leetcode.level1.day3;

import static com.leetcode.level1.utils.ListNode.ListNodeToArray;
import static org.junit.jupiter.api.Assertions.*;

import com.leetcode.level1.utils.ListNode;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MergeTwoSortedListsTest {

  public static Stream<Arguments> MergeTwoSortedListsTest() {
    return Stream.of(
        Arguments.of(
            new ListNode(1, new ListNode(2, new ListNode(4))),
            new ListNode(1, new ListNode(3, new ListNode(4))),
            new ListNode(1,
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))))
        ),
        Arguments.of(
            new ListNode(),
            new ListNode(),
            new ListNode(0, new ListNode(0))
        ),
        Arguments.of(
            new ListNode(),
            new ListNode(0),
            new ListNode(0, new ListNode(0))
        ),
        Arguments.of(
            new ListNode(2),
            new ListNode(1),
            new ListNode(1, new ListNode(2))
        )
    );
  }

  @BeforeEach
  public void setUp() {
  }

  @MethodSource
  @ParameterizedTest
  public void MergeTwoSortedListsTest(ListNode list1, ListNode list2, ListNode expected) {
    ListNode actual = MergeTwoSortedLists.mergeTwoLists(list1, list2);

    System.out.println(ListNodeToArray(expected));
    System.out.println(ListNodeToArray(actual));

    assertEquals(ListNodeToArray(expected), ListNodeToArray(actual));

  }
}
