 
package Arrays;
public class MaximumSubarry {
    public int maxiSum(int arr[]){
        //kadian's algo
        int maxSum = 0;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(currSum>=0){
                currSum+=arr[i];
            }else{
                currSum=arr[i];
            }
            if (currSum>maxSum) {
                maxSum=currSum;
            }
        }

        return maxSum;
    }
public static void main(String[] args) {
    int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
    int result = new MaximumSubarry().maxiSum(arr);
    System.out.println(result);
}
    
}