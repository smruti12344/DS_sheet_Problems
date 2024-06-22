 package Arrays;

// import java.util.Arrays;

public class ArrayMaximumAndMinimum {
    public static int[] findMaxAndMin(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        // 1st process of Tc: O(nlogn) and Sc:O(1)
    //    Arrays.sort(arr);
    //    max = arr[arr.length-1];
    //    min = arr[0];
      
    // 2nd process of Tc:O(n) and Sc:O(1)
      for (int i : arr) {
        if (i>max) {
            max=i;
        }
        if(i<min){
            min=i;
        }
      }
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
