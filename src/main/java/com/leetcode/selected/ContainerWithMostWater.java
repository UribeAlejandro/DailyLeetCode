package com.leetcode.selected;

public class ContainerWithMostWater {

  public static int maxArea(int[] height) {
    int pointer1 = 0;
    int pointer2 = height.length - 1;
    int maxArea = 0;
    while (pointer1 < pointer2) {
      int area = Math.min(height[pointer1], height[pointer2]) * (pointer2-pointer1);
      maxArea = Math.max(area, maxArea);
      if (height[pointer1] < height[pointer2]){
        pointer1++;
      } else {
        pointer2--;
      }
    }
    System.gc();
    return maxArea;
  }

}
