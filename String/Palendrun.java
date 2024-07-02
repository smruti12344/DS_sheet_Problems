 package String;

import java.util.Scanner;

public class Palendrun {
    public static boolean isPalindrome(String s) {
        // Initialize pointers
        int left = 0;
        int right = s.length() - 1;
         s = s.toLowerCase();
        while (left < right) {
            // Move the left pointer to the next alphanumeric character
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Move the right pointer to the previous alphanumeric character
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare the characters at the left and right pointers
            // if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                if(s.charAt(left) != s.charAt(right)){
                return false;
            }

            // Move both pointers towards the center
            left++;
            right--;
        }

        return true;
    }
 public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the String");
    String str = s.nextLine();
    System.out.println(Palendrun.isPalindrome(str));
    s.close();

 }
    
 }
