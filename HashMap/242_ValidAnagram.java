/*
LeetCode #242 - Valid Anagram

Approach:
1. If the lengths of both strings are different, return false.
2. Create two HashMaps to store the frequency of each character.
3. Count the frequency of characters in both strings.
4. Compare the two HashMaps.
5. If they are equal, the strings are anagrams.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        return map1.equals(map2);
    }
}
