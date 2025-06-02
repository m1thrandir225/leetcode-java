package com.sebastijanzindl.problems;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);

            res.putIfAbsent(sortedS, new ArrayList<>());
            res.get(sortedS).add(s);
        }

        return new ArrayList<>(res.values());
    }
}
