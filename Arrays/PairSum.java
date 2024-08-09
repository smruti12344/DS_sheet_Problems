 package Arrays;
 
 /**
  * PairSum
  */
 public class PairSum {
    boolean pairInSortedRotated(int arr[], int n, int x){
        //define required variables to be used 
        int pivot=0;
        for (int i = 0; i < arr.length-1; i++) {
          if (arr[i]>arr[i+1]) {
              pivot=i;
              break;
          }
          
        }         
        //define left and right pos
        int left = pivot+1%n;
        int right = pivot;
        //Iterate the array until left == right
        while (left !=right) {
            //check found pair
            if (arr[left]+arr[right]==x) {
                return true;
                
            }
            //if pair greater than x
            else if (arr[left]+arr[right]>x) {
                right =(n+right-1)%n;
                
            }
            //pair less than x
            else{
                left = (left+1)%n;
            }
        }
          return false;                           
  
   }
    public static void main(String[] args) {
        int arr[] = {11, 15, 6, 8, 9, 10}, X = 16;
        System.out.println(new PairSum().pairInSortedRotated(arr, arr.length, X));
 }
    
 }
