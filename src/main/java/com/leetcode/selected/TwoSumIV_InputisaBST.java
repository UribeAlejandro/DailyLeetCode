package com.leetcode.selected;

import com.leetcode.utils.TreeNode;
import java.util.HashMap;
import java.util.HashSet;

public class TwoSumIV_InputisaBST {

  private static HashSet<Integer> asList = new HashSet<>();

  public static boolean findTarget(TreeNode root, int k) {

    return find(root, k);
  }

  private static boolean find(TreeNode node, int k) {
    if (node == null) {
      return false;
    }

    if (asList.contains(k - node.val)) {
      return true;
    }

    asList.add(node.val);

    return find(node.left, k) || find(node.right, k);

  }
}
