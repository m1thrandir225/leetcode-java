package com.sebastijanzindl.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++) {
            int value = nums[i];

            if (i > 0 && value == nums[i - 1]) {
                continue;
            }

            int j =  i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = value + nums[j] + nums[k];

                if(sum > 0) {
                    k-=1;
                } else if (sum < 0) {
                    j += 1;
                } else {
                    result.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k])));
                    j += 1;

                    while (nums[j] == nums[j-1] && j < k) {
                        j += 1;
                    }
                }
            }
        }
        return result;
    }
}
