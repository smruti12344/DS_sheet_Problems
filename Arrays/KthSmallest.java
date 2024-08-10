package Arrays;

import java.util.PriorityQueue;

/**
 * KthSmallest
 */
public class KthSmallest {
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        //this can be solve by priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        while(k>1){
            pq.poll();
            k--;
        }
        return pq.peek();
        
    } 
    public static void main(String[] args) {
        int arr[]={7,10,4,3,20,15}, k=3,l=0,r=5;
      System.out.println(new KthSmallest().kthSmallest(arr, l, r, k));  
    }
} 
