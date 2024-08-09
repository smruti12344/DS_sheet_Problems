 package Arrays;
 
 
 public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        //here use two-pointer approch
        int left =0;
        int right =height.length-1;
        int max = Integer.MIN_VALUE;
        while (left<right) {
            //find left height and right height
            int left_h = height[left];
            int right_h = height[right];
            //find lowest height 
            int low_h = Math.min(left_h, right_h);
            //find length between left to right
            int len = right-left;

            //find area of water store
            int area = low_h*len;
            //store in max
            max = Math.max(max, area);
            //update left and right
            if (height[left]<height[right]) {
                left++;
            }else{
                right--;
            }
            
        }
        return max;
        
    }
    
    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7}; //ans = 49
        System.out.println(new ContainerWithMostWater().maxArea(arr));
    }
 }
