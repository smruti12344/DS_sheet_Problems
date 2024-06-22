 package Arrays;

import java.util.Arrays;

public class ArrayMaximumAndMinimum {
    public static int[] findMaxAndMin(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
       Arrays.sort(arr);
       max = arr[arr.length-1];
       min = arr[0];
        return new int[]{max,min};
    }
public static void main(String[] args) {
    int arr[] ={3, 5, 4, 1, 9};
    int ans []=ArrayMaximumAndMinimum.findMaxAndMin(arr);
    for (int i : ans) {
        System.out.println(i);
    }
} 
    
 }
