package SlidingWindow;

public class findMaxSum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int k = 3;

        System.out.println(findMaxSum(arr, k));
    }

    public static int findMaxSum(int arr[], int k) {
        int max_sum = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int current_sum = 0;
            for (int j = 0; j < k; j++) {
                current_sum += arr[i + j];
            }
            max_sum = Math.max(max_sum, current_sum);
        }
        return max_sum;
    }
}
