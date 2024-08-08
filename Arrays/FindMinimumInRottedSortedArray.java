 package Arrays;
 public class FindMinimumInRottedSortedArray {
    public int findMin(int[] nums) {
        //Define required variables
        int low =0;
        int high = nums.length-1;
        int ans = Integer.MAX_VALUE;

        //Define loop iterate over arrays
        while (low< high) {
            //find mid
            int mid = (low+high)/2;

            // apply condition for checking values
            if (nums[low]<nums[mid]) {
                ans = Math.min(ans, nums[low]);
                low = mid+1;
            }
            else{
                ans = Math.min(ans, nums[mid]);
                high = mid-1;
            }
        }
        return ans;
    }
 public static void main(String[] args) {
    int arr[] = {11,13,15,17};
    System.out.println(new FindMinimumInRottedSortedArray().findMin(arr));
 }
    
 }
