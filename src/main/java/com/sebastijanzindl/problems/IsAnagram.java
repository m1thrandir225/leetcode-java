package com.sebastijanzindl.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class IsAnagram {
    public static boolean run(String s, String t) {
        HashMap<Character, Integer> frequencyC = new HashMap<>();
        HashMap<Character, Integer> frequencyT = new HashMap<>();

        if(s.length() != t.length()) {
            return false;
        }
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(frequencyC.containsKey(c)) {
                frequencyC.put(c, frequencyC.get(c) + 1);
            } else {
                frequencyC.put(c, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (frequencyT.containsKey(c)) {
                frequencyT.put(c, frequencyT.get(c) + 1);
            } else {
                frequencyT.put(c, 1);
            }
        }

        for( int i = 0 ; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!Objects.equals(frequencyC.get(c), frequencyT.get(c))) {
                return false;
            }
        }
        return true;
    }
}
