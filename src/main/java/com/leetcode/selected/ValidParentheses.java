package com.leetcode.selected;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
      int N = s.length();
      Stack<Character> stck = new Stack<>();

      if (N == 1){
        return false;
      }

      for (char c: s.toCharArray()) {
        if (c == '(' || c=='[' || c=='{') {
          stck.push(c);
        } else {
          if (stck.empty()) {
            return false;
          } else if (stck.peek() == '(' && c !=')' || stck.peek() == '[' && c !=']' || stck.peek() == '{' && c !='}') {
            return false;
          } else {
            stck.pop();
          }
        }
      }
      return stck.empty();
    }

}
