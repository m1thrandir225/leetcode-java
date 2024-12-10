package com.sebastijanzindl.problems;

public class ContainerWithMostHeight {
    public static int maxArea(int[] height) {
       int max_area = 0;
       int left = 0;
       int right = height.length - 1;
       while (left < right) {
           int distance = right - left;
           int lowest_height = Math.min(height[left], height[right]);
           int current_area = distance * lowest_height;
           max_area = Math.max(max_area, current_area);

           if(height[left] < height[right]) {
               left++;
           } else {
               right--;
           }
       }
       return max_area;
    }
}
