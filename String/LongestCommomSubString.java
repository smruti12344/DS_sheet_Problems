package String;

import java.util.HashSet;
import java.util.Set;

public class LongestCommomSubString {
    public int lengthOfLongestSubstring(String s) {
        int  maxCount=0;
        int j=0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
           if (set.add(ch)) {
            maxCount = Math.max(maxCount, i-j+1);
            
           }else{
            while (s.charAt(j)!=ch) {
                set.remove(s.charAt(j));
                j++;
                
            }
           }
        }
        return maxCount;
    }
public static void main(String[] args) {
    String str = "abcabcbb";
    System.out.println(new LongestCommomSubString().lengthOfLongestSubstring(str));
}
    
} 
