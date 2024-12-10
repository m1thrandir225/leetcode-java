package com.sebastijanzindl.problems;

import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target)  {
        Map<Integer, Integer> lookup = new HashMap<>();
        for (int i =0; i < nums.length; i++) {
            int value = nums[i];

            if (lookup.containsKey(value)) {
                int complementIndex = lookup.get(value);
                return new int[]{complementIndex, i};
            }

            int complement = target - value;
            lookup.put(complement, i);
        }
        System.out.println(lookup);
        return new int[]{-1, -1};
    }
}