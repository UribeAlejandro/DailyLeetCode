package com.leetcode.level1.day4;

import static com.leetcode.level1.utils.ListNode.ListNodeToArray;
import static org.junit.jupiter.api.Assertions.*;

import com.leetcode.level1.utils.ListNode;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MiddleoftheLinkedListTest {

  private static Stream<Arguments> MiddleoftheLinkedListTest() {
    return Stream.of(
        Arguments.of(
            new ListNode(1,
                new ListNode(2,
                    new ListNode(3,
                        new ListNode(4,
                            new ListNode(5,
                                new ListNode(6, null)
                            )
                        )
                    )
                )
            ),
            new ListNode(4, new ListNode(5, new ListNode(6, null)))
        ),
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
            new ListNode(3, new ListNode(4, new ListNode(5, null)))
        )
    );
  }

  @BeforeEach
  public void setup() {

  }

  @MethodSource
  @ParameterizedTest
  public void MiddleoftheLinkedListTest(ListNode head, ListNode expected) {
    ListNode actual = MiddleoftheLinkedList.middleNode(head);

    assertEquals(ListNodeToArray(expected), ListNodeToArray(actual));
  }


}
