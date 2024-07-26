package Arrays;
public class ProductArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
    //Here use Auxiliray array concept
    int n = nums.length;
    int ans[] = new int[n];

    //1st calculate prifix of each elem of the array
    ans[0]=1;
    for (int i = 1; i < ans.length; i++) {
        ans[i] = ans[i-1]*nums[i-1];
    }
    //calcaulate suffix and return ans array
    int suffix=1;
    for (int i = n-1; i>=0; i--) {
        ans[i] = ans[i]*suffix;
        suffix = suffix*nums[i];
    }
    return ans;
    }
public static void main(String[] args) {
    int arr[]= {1,2,3,4};
    int res[] = new ProductArrayExceptSelf().productExceptSelf(arr);
    for (int i = 0; i < res.length; i++) {
        System.out.print(res[i]+" ");
    }
    
}
    
} 
