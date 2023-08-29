package org.example;

import java.util.HashMap;

public class IsomorphicString {
    public static boolean areIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (map.containsKey(charS)) {
                if (map.get(charS) != charT) {
                    return false; // Mapping conflict
                }
            } else {
                if (map.containsValue(charT)) {
                    return false; // Multiple characters mapping to the same character in t
                }
                map.put(charS, charT);
            }
        }

        return true;
    }
}
