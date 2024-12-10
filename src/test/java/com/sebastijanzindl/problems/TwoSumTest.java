package com.sebastijanzindl.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test
    public void testTwoSum() {
        int target = 9;
        int[] input = {2,7,11,15};

        int[] expected = {0, 1};

        int[] solution = TwoSum.twoSum(input, target);
        assertArrayEquals(expected, solution);
    }
}