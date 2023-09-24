package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int i, j, key;
        int[] arr = { 55, 27, 13, 92, 11, 48, 75, 88, 5 };
        System.out.println("Array before Sorting: " + Arrays.toString(arr));

        // ascending

        for (i = 1; i < arr.length; i++) {
            j = i - 1;
            key = arr[i];
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println("Array (asc) after Sorting: " + Arrays.toString(arr));

        // descending

        for (i = 1; i < arr.length; i++) {
            j = i - 1;
            key = arr[i];
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println("Array (desc) after Sorting: " + Arrays.toString(arr));
    }

}
