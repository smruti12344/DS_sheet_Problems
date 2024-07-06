 
package Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) { //1,2,3
    int i = nums.length-2;
    //find the 1st decresing elem from the right
    while (i>=0 && nums[i]>nums[i+1]) { //2 i=1
        i--;
    }

    //if such elem found, then find 1st incresing elem to the right of nums[i]
    //find nums[i+1]>nums[i]
    if (i>=0) {
        int j=nums.length-1;
        while (nums[j]<nums[i]) {
            j--;
        }
        //find both elem then swap
        swap(nums,j,i);
    }
    //after swaping both elem then reverse from right elem of nums[i]
    reverse(nums,i+1);
    }
    //swap
    public void swap(int nums[],int j,int i){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j] = temp;
    }
    //reverse
    public void reverse(int nums[],int left){
        
        int right =nums.length-1;
        while (left<right) {
            swap(nums, left, right);
            left++;
            right--;
            
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
         new NextPermutation().nextPermutation(arr);
         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
         }
    }
    
}