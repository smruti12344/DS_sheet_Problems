package Arrays;

public class MaximumProductSubArray {
    // public int productMaximum(int[] nums) {
    //     int maxP = Integer.MIN_VALUE;

    //     for (int i = 0; i < nums.length; i++) {
    //         int prod = 1;
    //         for (int j = i; j < nums.length; j++) {
    //             prod *= nums[j];
    //             System.out.println(i + ":" + prod);
    //             if (prod > maxP) {
    //                 maxP = prod;
    //             }
    //         }
    //     }
    //     return maxP;
    // }

    //By using Observation method
    public int productMaximum(int nums[]){
        int prefix =1;
        int suffix =1;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (prefix==0) {
                prefix=1;
            }
            if (suffix==0) {
                suffix=1;
            }
            prefix=prefix*nums[i];
            suffix =suffix*nums[nums.length-i-1];
            ans = Math.max(ans, Math.max(prefix, suffix));
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, -2, 4};
        System.out.println(new MaximumProductSubArray().productMaximum(arr)); // Output should be 6
    }
}
