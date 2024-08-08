 package Arrays;
 public class FindPairOfSuminGivenRottedArray {
    int pairInSortedRotated(int arr[], int n, int x){
      //define required variables to be used 
      int pivot=0;
      int count=0;
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
          if (arr[left] + arr[right] == x) {
            count++;
            
            // Move to the next pair
            if (left == (right - 1 + n) % n) {
                break;
            }
            left = (left + 1) % n;
            right = (right - 1 + n) % n;
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
        // return false;
        return count;                           

 }
 public static void main(String[] args) {
    int arr[] = {11, 15, 6, 7, 9, 10}, X = 16;
    System.out.println(new FindPairOfSuminGivenRottedArray().pairInSortedRotated(arr, arr.length, X));
 }
    
 }
