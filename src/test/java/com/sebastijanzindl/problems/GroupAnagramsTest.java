package com.sebastijanzindl.problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {
    @Test
    void groupAnagrams() {
        final GroupAnagrams groupAnagrams = new GroupAnagrams();

        String[] input = {"act","pots","tops","cat","stop","hat"};

        List<List<String>> expected = List.of(List.of("act", "cat"), List.of("pots", "tops", "stop"), List.of("hat"));

        assertEquals(expected, groupAnagrams.groupAnagrams(input));
    }
}