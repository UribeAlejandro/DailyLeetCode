package com.leetcode.level1.utils;

public class ListNode {

  public int val;
  public ListNode next;

  public ListNode() {
  }

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }


  public static ListNode iterateListNode(ListNode a) {
    if (a == null) {
      return null;
    } else {
      System.out.println(a.val);
      return iterateListNode(a.next);
    }
  }
}
