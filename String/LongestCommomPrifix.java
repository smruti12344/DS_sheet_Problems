
package String;

import java.util.Arrays;

public class LongestCommomPrifix {
    public String longestCommonPrefix(String[] strs) {
    //step-1: sort the array
    Arrays.sort(strs);
    //step-2 : define two string variable who contains first and last index string
    String s1 = strs[0];
    String s2 =strs[strs.length-1];
    int idx =0;
    //step-3 : compare two string and count common charecter
    while (idx<s1.length() && idx < s2.length()) {
        //compare
        if (s1.charAt(idx)==s2.charAt(idx)) {
            idx++;
            
        }
        else{
            break;
        }
        
    }
    return s1.substring(0, idx);
    }
public static void main(String[] args) {
    String str[]={"flower","flow","flight"};
    String res = new LongestCommomPrifix().longestCommonPrefix(str);
    System.out.println(res);
}
    
}