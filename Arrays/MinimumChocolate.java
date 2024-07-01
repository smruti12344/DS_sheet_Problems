 
package Arrays;

import java.util.Arrays;

public class MinimumChocolate {
    public int minimum(int arr[],int m){
        int min = Integer.MAX_VALUE;
        //sort the array
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-m-1; i++) {
            //check min
            if(arr[i+m-1]-arr[i]<min){
                min = arr[i+m-1]-arr[i];
            }
        }
        return min;
    }
public static void main(String[] args) {
    int arr[] ={3, 4, 1, 9, 56, 7, 9, 12};
    int diff = new MinimumChocolate().minimum(arr, 5);
    System.out.println(diff);
}
    
}