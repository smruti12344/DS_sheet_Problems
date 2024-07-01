 
package Arrays;

import java.util.Arrays;

public class Duplicate {
    public static boolean duplicate(int arr[]){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }
public static void main(String[] args) {
    int arr[]={1,4,5,6,7,10};
   boolean result = Duplicate.duplicate(arr);
   System.out.println("Array contain Duplicate:"+result);
}
    
}