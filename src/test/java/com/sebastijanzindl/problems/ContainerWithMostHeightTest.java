package com.sebastijanzindl.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostHeightTest {
    @Test
    void contains() {
        int[] arr = new int[]{4,3,2,1,4};

        int expected = 16;

        int result = ContainerWithMostHeight.maxArea(arr);
        assertEquals(expected, result);
    }
}