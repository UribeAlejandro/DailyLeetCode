package com.leetcode.level1.extra;

import com.leetcode.utils.ListNode;

public class SplitLinkedListInParts {
  /*
  Given the head of a singly linked list and an integer k, split the linked list into k consecutive
  linked list parts.

  The length of each part should be as equal as possible: no two parts should have a size differing
  by more than one. This may lead to some parts being null.

  The parts should be in the order of occurrence in the input list, and parts occurring earlier
  should always have a size greater than or equal to parts occurring later.

  Return an array of the k parts.
  */

  public static ListNode[] splitListToParts(ListNode head, int k) {
    ListNode[] list_node = new ListNode[k];

    if (head == null) {
      return list_node;
    }

    ListNode curNode = head;
    int count = 0;

    while (curNode != null) {
      curNode = curNode.next;
      ++count;
    }

    int size = count / k, rem = count % k;

    curNode = head;
    for (int i = 0; i < k; i++) {
      ListNode dummy = new ListNode(0);
      ListNode temp = dummy;

      for (int j = 0; j < size + (i < rem ? 1 : 0); j++) {
        temp.next = new ListNode(curNode.val);
        temp = temp.next;
        curNode = curNode.next;
      }
      list_node[i] = dummy.next;
    }
    return list_node;
  }

}

