package Looping_Patterns_Iteration_Flow;

public class findMaxSum {

    // NAIVE APPROACH (USUAL APPROACH)

    // public static int findMaxSum(int arr[], int k) {
    // int max_sum = Integer.MIN_VALUE;
    // int n = arr.length;

    // // Iterate through the array until we can't fit a window of size k
    // for (int i = 0; i <= n - k; i++) {
    // int current_sum = 0;
    // // Calculate sum of the current window
    // for (int j = 0; j < k; j++) {
    // current_sum += arr[i + j];
    // }
    // max_sum = Math.max(max_sum, current_sum);
    // }
    // return max_sum;
    // }

    public static int findMaxSum(int[] arr, int k) {
        int n = arr.length; // 10
        if (n < k) // 10 < 3
            return -1;

        int max_sum = 0;
        int window_sum = 0;

        // 1. Calculate the sum of the very first window
        for (int i = 0; i < k; i++) {
            window_sum += arr[i];
        }
        max_sum = window_sum;
        System.out.println("Max Sum: " + max_sum);
        System.out.println("Window Sum: " + window_sum);
        // 2. Slide the window from left to right
        for (int i = k; i < n; i++) { // 3 < 10, 4 < 10
            // Add the next element, subtract the element that is now outside the window
            window_sum += arr[i] - arr[i - k]; // 6 = 6 + 4 - 1, 9 = 9 + 4 - 1, 12 = 12 + 4 - 1
            System.out.println("Loop Window Sum: " + window_sum);

            max_sum = Math.max(max_sum, window_sum); // (6,9) = 9
            System.out.println("Loop Max Sum: " + max_sum);

        }

        return max_sum;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 7, 6 };
        int k = 3;

        System.out.println(findMaxSum(arr, k));
    }

}
