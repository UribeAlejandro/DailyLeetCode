package com.leetcode.level1.day4;

import com.leetcode.utils.ListNode;

public class MiddleoftheLinkedList {
  /*
  Given the head of a singly linked list, return the middle node of the linked list.
  If there are two middle nodes, return the second middle node.
  */

  public static ListNode middleNode(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    return slow;
  }
}
