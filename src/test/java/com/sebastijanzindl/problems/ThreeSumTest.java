package com.sebastijanzindl.problems;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {
    @Test
    void threeSumTest1() {
        ThreeSum threeSum = new ThreeSum();
        int[] nums = {-1,0,1,2,-1,-4};

        List<List<Integer>> result = threeSum.threeSum(nums);

        List<List<Integer>> expected = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(-1, -1, 2)), new ArrayList<>(Arrays.asList(-1, 0, 1))));
        assertEquals(expected, result);
    }

    @Test
    void threeSumTest2() {
        ThreeSum threeSum = new ThreeSum();
        int[] nums = {0, 1, 1};

        List<List<Integer>> result = threeSum.threeSum(nums);

        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test
    void threeSumTest3() {
        ThreeSum threeSum = new ThreeSum();
        int[] nums = {0, 0, 0};

        List<List<Integer>> result = threeSum.threeSum(nums);

        List<List<Integer>> expected = new ArrayList<>(List.of(new ArrayList<>(Arrays.asList(0, 0, 0))));
        assertEquals(expected, result);
    }


}