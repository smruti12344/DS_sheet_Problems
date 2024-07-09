import java.util.Stack;

/**
 * Parentheses
 */
public class Parentheses {
    public boolean isValid(String s) {
        //step-1: Define a stack who hold the string
        Stack<Character>stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            //check open brack and store in stack
            if (s.charAt(i) =='(' || s.charAt(i)=='[' || s.charAt(i)=='{') {
                stack.push(s.charAt(i));
            }
            else{
                //check for 1st closing bracket
                if (stack.isEmpty()) {
                    return false;
                }
                //check for 1st closing bracket then open bracket ) (
                    char c = stack.pop();
                    if ((s.charAt(i)==')' && c!='(') || (s.charAt(i)==']' && c!='[') || (s.charAt(i)=='}' && c!='{')) {
                        return false;
                        
                    }
                    // else{
                    //     return false;
                    // }
            }
        }
       return stack.isEmpty();

    }
    public static void main(String[] args) {
        String s = ")([]{}";
        boolean result = new Parentheses().isValid(s);
        System.out.println(result);
    }
}