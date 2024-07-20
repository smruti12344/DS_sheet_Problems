package Arrays;
public class RainWaterTrapping {
    public int trap(int[] height) {
    //define Axulary array
    int n = height.length;
    int left[] = new int [n];
    int right[]= new int[n];

    //update the left array with miximum height from left to right
    left[0]=height[0];
    for (int i = 1; i < height.length; i++) {
        left[i] = Math.max(height[i], left[i-1]);
    }
    //update the right array with maximum height from right to left
    right[n-1] = height[n-1];
    for (int i= n-2;i>=0; i--) {
      right[i]= Math.max(height[i], right[i+1]);
        
    }
    // for (int i = 0; i < left.length; i++) {
    //     System.out.print(left[i]+" ");
    // }
    //calculate maximum water trapping 
    int ans =0;
    for (int i = 0; i < right.length; i++) {
        ans+= (Math.min(left[i], right[i])-height[i]);
    }
    return ans;

    }
public static void main(String[] args) {
    int input[]={4,2,0,3,2,5};
    int res = new RainWaterTrapping().trap(input);
    System.out.println(res);
}
    
} 
