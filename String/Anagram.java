package String;

import java.util.HashMap;
import java.util.Map;

//Anagram is when String s == String t in any order
public class Anagram {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        // Store s string characters in the map and add the number of occurrences
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Debug: Print the map after storing characters from s
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            System.out.println("key: " + key + " value: " + value);
        }

        // Iterate over t string and check the character and occurrences of characters in the map
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!map.containsKey(c)) {
                return false; // If character in t is not in map, not an anagram
            }
            int count = map.get(c);
            if (count == 1) {
                map.remove(c); // Remove character from map if its count reaches zero
            } else {
                map.put(c, count - 1); // Decrease the count of the character
            }
        }

        // Debug: Print the map after updating with characters from t
        System.out.println("after removing character");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            System.out.println("key: " + key + " value: " + value);
        }
        System.out.println(map.size());

        // If map is empty, then s and t are anagrams
        return map.isEmpty();
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";

        boolean result = new Anagram().isAnagram(s, t);
        System.out.println(result); // Should print true
    }
}
