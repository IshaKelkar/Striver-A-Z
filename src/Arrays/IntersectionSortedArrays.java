package Arrays;

import java.util.ArrayList;
import java.util.List;

public class IntersectionSortedArrays {
    public static void main(String[] args) {
        // Initialize two sorted arrays
        int[] arr1 = {1, 2, 4, 5, 6, 7};
        int[] arr2 = {2, 5, 5, 6, 7};

        // Call findIntersection method to get the intersection of the two arrays
        List<Integer> intersectionList = findIntersection(arr1, arr2);

        // Print the intersection list
        for (int num : intersectionList) {
            System.out.print(num + " ");
        }
    }

    public static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        // Create a list to store the intersection of the two arrays
        List<Integer> intersectionList = new ArrayList<>();

        // Initialize pointers for both arrays
        int i = 0, j = 0;

        // Traverse both arrays simultaneously
        while (i < arr1.length && j < arr2.length) {
            // If elements are equal, add it to the intersection list if it's not already there
            if (arr1[i] == arr2[j]) {
                if (intersectionList.isEmpty() || intersectionList.get(intersectionList.size() - 1) != arr1[i]) {
                    intersectionList.add(arr1[i]);
                }
                i++;
                j++;
            }
            // If current element of arr1 is smaller, move its pointer
            else if (arr1[i] < arr2[j]) {
                i++;
            }
            // If current element of arr2 is smaller, move its pointer
            else {
                j++;
            }
        }

        // Return the intersection list
        return intersectionList;
    }
}
