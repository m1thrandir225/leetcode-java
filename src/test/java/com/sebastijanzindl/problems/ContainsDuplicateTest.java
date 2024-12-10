package com.sebastijanzindl.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {
    @Test
    public void containsDuplicate() {
        int[]nums = {1,2,3,4,5,6,7,8,9,1};
        assertTrue(ContainsDuplicate.containsDuplicate(nums));
    }

}