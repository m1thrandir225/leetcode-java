package com.sebastijanzindl.problems;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int left = 0, maxLength = 0, n = s.length();
        //Keep track of the current substring
        Set<Character> set = new HashSet<>();


        for (int right = 0; right < n; right++) {
            //if the set doesn't contain then the current substring continues,
            // add it to the set
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                //compare the current maxLen to the distance between the right and left pointers + 1 because they are indexes
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                //delete the current indexes from before the right pointer
                while(set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left));
                    right++;
                }

                //add the first one of the new substring
                set.add(s.charAt(right));
            }
        }
        return maxLength;
    }
}
