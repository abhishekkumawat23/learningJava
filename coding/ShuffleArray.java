package coding;

// Given the array nums consisting of 2n elements in the
// form [x1,x2,...,xn,y1,y2,...,yn].
// 
// Return the array in the form [x1,y1,x2,y2,...,xn,yn].
//
// Constraints:
// 1 <= n <= 500
// nums.length == 2n
// 1 <= nums[i] <= 10^3
public class ShuffleArray {
    public static void main(String[] args) {
        
    }

    public int[] shuffle(int[] nums, int n) {

        int[] result = new int[nums.length];
        // result ka even -> nums ka 0 se n-1
        // result ka odd -> nums ka n se 2n-1
        for (int i = 0; i < nums.length; i += 2) {
            result[i] = nums[i/2];
        }

        for (int i = 1; i < nums.length; i += 2) {
            result[i] = nums[n + (i-1)/2];
        }

        return result;

    }

    public int[] shuffleApproach2(int[] nums, int n) {

        int[] result = new int[nums.length];
        // result ka even -> nums ka 0 se n-1
        // result ka odd -> nums ka n+0 se n+n-1
        for (int i = 0; i < nums.length; i += 2) {
            // i = 0, 2, 4, 6
            result[i] = nums[i/2]; // even case
            result[i+1] = nums[n + (i-1)/2]; // odd case
        }

        return result;
    }

    public int[] shuffleApproach3(int[] nums, int n) { // O(n), O(n)
        int[] result = new int[nums.length]; // O(1), O(n)

        for (int i = 0; i < nums.length; i++) { // O(n), O(1)
            result[i] = (i % 2 == 0) ? nums[i/2] : nums[n + (i - 1) / 2]; // O(1), O(1)
        }

        return result; // O(1), O(1)
    }

    public int[] shuffleApproach4(int[] nums, int n) {
        int[] result = new int[nums.length];
        // result ka even -> nums ka 0 to n-1
        // result ka odd -> nums ka n to 2n-1
        for (int i = 0; i < n; i += 2) {
            result[2*i] = nums[i]; // even case.
            result[2*i+1] = nums[n+i]; // odd case.
        }

        return result;
    }

    public void solve() {
        int a = 2^31;
        int b = 2^31;
    }
    
}
