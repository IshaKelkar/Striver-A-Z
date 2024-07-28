package Arrays;

public class RotateArrayByD {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2; // Number of places to rotate

        rotate(arr, k);

        // Print the rotated array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // In case k is larger than array length

        reverse(arr, 0, n - 1); // Reverse the whole array
        reverse(arr, 0, k ); // Reverse the first k elements
        reverse(arr, k+1, n - 1); // Reverse the remaining elements
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
