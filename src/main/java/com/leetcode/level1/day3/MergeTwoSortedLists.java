package com.leetcode.level1.day3;

import com.leetcode.utils.ListNode;

public class MergeTwoSortedLists {
  /*
  You are given the heads of two sorted linked lists list1 and list2.
  Merge the two lists in a one sorted list. The list should be made by splicing together the nodes
  of the first two lists.
  Return the head of the merged linked list.
  */

  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode mergedList = new ListNode();
    ListNode sortingPointer = mergedList;

    while (list1 != null && list2 != null) {
      if (list1.val <= list2.val) {
        sortingPointer.next = list1;
        list1 = list1.next;
      } else {
        sortingPointer.next = list2;
        list2 = list2.next;
      }
      sortingPointer = sortingPointer.next;
    }

    if (list1 != null) {
      sortingPointer.next = list1;
      list1 = list1.next;
    }
    if (list2 != null) {
      sortingPointer.next = list2;
      list2 = list2.next;
    }

    return mergedList.next;
  }

}
