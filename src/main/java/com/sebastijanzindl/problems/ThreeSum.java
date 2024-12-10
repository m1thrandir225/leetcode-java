package com.sebastijanzindl.problems;

import java.util.Arrays;

public class ThreeSum {
    public static boolean findSumOfThree(int[] nums, int target)
    {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum > target) {
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

}
