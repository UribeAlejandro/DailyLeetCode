package com.leetcode.level1.day6;

import com.leetcode.utils.Node;
import java.util.ArrayList;
import java.util.List;

public class NaryTreePreorderTraversal {

  /*
  Given the root of an n-ary tree, return the preorder traversal of its nodes' values.

  Nary-Tree input serialization is represented in their level order traversal.
  Each group of children is separated by the null value
   */
  List<Integer> preordered = new ArrayList<>();

  public List<Integer> preorder(Node root) {
    if (root == null) {
      return preordered;
    }

    depthFirstSearch(root);

    return preordered;
  }

  public void depthFirstSearch(Node node) {
    if (node.children == null) {
      return;
    }
    preordered.add(node.val);

    for (Node children : node.children) {
      depthFirstSearch(children);
    }
  }
}
