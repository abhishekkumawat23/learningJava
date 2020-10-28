package coding;

public class RunningSum {
    public static void main(String[] args) {
        int[] input = new int[] {11, 12, 13, 14};
        int[] result = solveApproach1(input);
        System.out.println(result);
    }

    // Time complexity: O(n^2) where n is length of the array.
    // Space complexity: O(n)
    public static int[] solveApproach1(int[] input) {
        int length = input.length;
        int[] result = new int[length]; // O(n)

        for (int i = 0; i < length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum = sum + input[j];
            }
            result[i] = sum;
        }

        return result;
    }

    // Time complexity good, space complexity bad.
    public static int[] solveApproach2(int[] input) {
        int length = input.length;
        int[] result = new int[length];
        int sum = 0;

        for (int i = 0; i < length; i++){
            sum = sum + input[i];
            result[i] = sum;
        }
        return result;
    }

    // Time complexity - good, space complexity good
    public static int[] solveApproach3(int[] input) {
        int length = input.length;
        
        for (int i = 1; i < length; i++) {
            input[i] = input[i] + input[i-1];
        }
        
        return input;
    }
    
}
