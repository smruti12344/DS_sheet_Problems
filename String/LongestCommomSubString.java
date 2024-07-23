package String;

import java.util.HashSet;
import java.util.Set;

public class LongestCommomSubString {
    
        public int lengthOfLongestSubstring(String s) {
            int n = s.length();
            int maxLength = 0;
            Set<Character> charSet = new HashSet<>();
            int left = 0;
            
            for (int right = 0; right < n; right++) {
                if (!charSet.contains(s.charAt(right))) {
                    charSet.add(s.charAt(right));
                    maxLength = Math.max(maxLength, right - left + 1);
                } else {
                    while (charSet.contains(s.charAt(right))) {
                        charSet.remove(s.charAt(left));
                        left++;
                    }
                    charSet.add(s.charAt(right));
                }
            }
            
            return maxLength;
        }
    
public static void main(String[] args) {
    String str = "abcabcbb";
    System.out.println(new LongestCommomSubString().lengthOfLongestSubstring(str));
}
    
} 
