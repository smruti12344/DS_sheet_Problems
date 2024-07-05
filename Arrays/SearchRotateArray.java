package Arrays;

public class SearchRotateArray {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Check if the left part is sorted
            if (nums[left] <= nums[mid]) {
                // Target is in the left part
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } 
            // Otherwise, the right part must be sorted
            else {
                // Target is in the right part
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2}; 
        int res = new SearchRotateArray().search(arr, 0);
        System.out.println(res); // Output should be 4
    }
}
