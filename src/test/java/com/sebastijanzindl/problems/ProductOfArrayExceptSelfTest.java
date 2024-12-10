package com.sebastijanzindl.problems;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {
    @Test
    void productOfArrayExceptSelf() {
        int[] array = new int[]{1, 2, 3, 4};

        int[] expected = new int[]{24, 12, 8, 6};

        int[] result = ProductOfArrayExceptSelf.productExceptSelf(array);
        assertArrayEquals(expected, result);
    }
}