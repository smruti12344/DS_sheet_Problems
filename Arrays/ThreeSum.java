package Arrays;


import java.util.*;

public class ThreeSum {
   
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return result;
        }
        
        // Sort the array to make it easier to avoid duplicates and use two pointers
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip the same element to avoid duplicate triplets
            System.out.println("value of i :"+i);
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    
                    // Skip the same elements to avoid duplicates in the result
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};
        
        // Call the threeSum method and store the result
        List<List<Integer>> result = new ThreeSum().threeSum(arr);
        
        // Print the result
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
    
}

