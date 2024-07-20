 
package Arrays;
public class ProductOfArrayExceptIt {
    public int[] product(int nums[]){
        //define to array for calculate prefix and suffix of array
        int n= nums.length;
        int prefix [] = new int[n];
        int suffix[] = new int[n];

        //prefix
        prefix[0]=1;
        for (int i = 1; i <n; i++) {
            prefix[i]= prefix[i-1]*nums[i-1];
            
        }
        //suffix
        suffix[n-1]=1;
        for (int i= n-2;i>=0;i-- ) {
            suffix[i]=suffix[i+1]*nums[i+1];
        }
        for (int i = 0; i < n; i++) {
            nums[i]= prefix[i]*suffix[i];
            
        }
        return nums;
    }
public static void main(String[] args) {
    int input[]={1,2,3,4};
    int res[] = new ProductOfArrayExceptIt().product(input);
    for (int i : res) {
        System.out.print(i+" ");
    }
}
    
}