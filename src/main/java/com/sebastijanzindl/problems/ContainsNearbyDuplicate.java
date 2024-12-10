package com.sebastijanzindl.problems;

import java.util.HashSet;
import java.util.Set;

public class ContainsNearbyDuplicate {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(i > k) {
                // Out of range, remove the element that is out of the current range
                set.remove(nums[i - k - 1]);
            }
            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);
        }

        return false;
    }
}
