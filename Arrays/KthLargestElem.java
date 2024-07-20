 
package Arrays;

import java.util.PriorityQueue;

public class KthLargestElem {
    public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer>pq = new PriorityQueue<>((a,b)->b-a);
    for (Integer integer : nums) {
        pq.add(integer);
    }
    // pq.forEach((r)->{
    //     System.out.println(r);
    // });
    while (k>1) {
        pq.remove();
        k--;
    }
    return pq.peek();
    }
public static void main(String[] args) {
    int arr[]={3,2,1,5,6,4};
    int res = new KthLargestElem().findKthLargest(arr, 2);
    System.out.println(res);
}
    
}