package com.sebastijanzindl.problems;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> lookup = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            if(lookup.containsKey(number)) {
                return true;
            }
            lookup.put(number, i);
        }
        return false;
    }
}
