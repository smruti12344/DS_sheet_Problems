 
package String;
public class RemoveConsugativeChar {
    public String removeConsecutiveCharacter(String S){
        String str = "";
        str=String.valueOf(S.charAt(0));
        for(int i=1;i<S.length();i++){
            if(S.charAt(i-1)==S.charAt(i)){
                continue;
            }
            str+=S.charAt(i);
        }
        return str;
    }
    public static void main(String[] args) {
        String s = "aabb";
        String res = new RemoveConsugativeChar().removeConsecutiveCharacter(s);
        System.out.println(res);
    }
    
}