package coding;

public class BinarySearch {

    public int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while (low <= high) {
            int mid = low + (high-low)/2; // Not using (low+high)/2 to avoid integer overflow.
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) low = mid + 1;
            else high = mid - 1;
        }

        return low;
    }
    
}
