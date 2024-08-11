package Arrays;

import java.util.ArrayList;
import java.util.List;

public class UnionSortedArrays {
    public static void main(String[] args) {
        // Initialize two sorted arrays
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {1, 2, 3, 5, 7};

        // Call findUnion method to get the union of the two arrays
        List<Integer> unionList = findUnion(arr1, arr2);

        // Print the union list
        for (int num : unionList) {
            System.out.print(num + " ");
        }
    }

    public static List<Integer> findUnion(int[] arr1, int[] arr2) {
        // Create a list to store the union of the two arrays
        List<Integer> unionList = new ArrayList<>();

        // Initialize pointers for both arrays
        int i = 0, j = 0;

        // Traverse both arrays simultaneously
        while (i < arr1.length && j < arr2.length) {
            // If current element of arr1 is smaller, add it to the union list if it's not already there
            if (arr1[i] < arr2[j]) {
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr1[i]) {
                    unionList.add(arr1[i]);
                }
                i++;
            }
            // If current element of arr2 is smaller, add it to the union list if it's not already there
            else if (arr1[i] > arr2[j]) {
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr2[j]) {
                    unionList.add(arr2[j]);
                }
                j++;
            }
            // If elements are equal, add any one of them to the union list and move both pointers
            else {
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr1[i]) {
                    unionList.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        // Add remaining elements of arr1 to the union list
        while (i < arr1.length) {
            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr1[i]) {
                unionList.add(arr1[i]);
            }
            i++;
        }

        // Add remaining elements of arr2 to the union list
        while (j < arr2.length) {
            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr2[j]) {
                unionList.add(arr2[j]);
            }
            j++;
        }

        // Return the union list
        return unionList;
    }
}
