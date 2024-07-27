package Arrays;

// Remove Duplicates from the Sorted Array
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4, 4};
        int newLength = removeElements(arr);

        // Print the entire array showing unique elements at the start and duplicates at the end
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int removeElements(int[] arr) {

        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}
