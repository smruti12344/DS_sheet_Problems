 
package Arrays;


public class MinimumInRottedSortedArray {
    public int findMin(int[] nums) {
        // int min=Integer.MAX_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<min){
        //         min=nums[i];
        //     }
        // }
        // return min;

        int lw=0;
          int h=nums.length-1;
          int ans = Integer.MAX_VALUE;
          while(lw<=h){
            int mid=(lw+h)/2;

            if(nums[lw]<=nums[mid]){
               ans=Math.min(ans, nums[lw]);
               lw=mid+1;
            }else{
                h=mid-1;
                ans=Math.min(ans,nums[mid] );
            }
          }
          return ans;
    }
    public static void main(String[] args) {
    int arr[] = {3,4,5,1,2};
    System.out.println(new MinimumInRottedSortedArray().findMin(arr));
}
    
}