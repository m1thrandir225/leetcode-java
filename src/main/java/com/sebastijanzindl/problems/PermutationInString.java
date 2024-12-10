package com.sebastijanzindl.problems;

import java.util.HashSet;
import java.util.Set;

public class PermutationInString {
    private static boolean isEqual(int []a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPermutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count1  = new int[26];
        int[] count2  = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count1[s.charAt(i) - 'a']++;
            count2[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length() - t.length(); i++) {
            if(isEqual(count1, count2)) {
                return true;
            }
            count2[t.charAt(i) - 'a']--;

        }
        return false;
    }
}
