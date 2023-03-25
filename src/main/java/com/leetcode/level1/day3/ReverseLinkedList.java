package com.leetcode.level1.day3;

import com.leetcode.utils.ListNode;

public class ReverseLinkedList {
  /*
  Given the head of a singly linked list, reverse the list, and return the reversed list.
  */

  public static ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode next = null;
    ListNode current = head;

    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }

    current = prev;

    return current;
  }
}
