package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int i, j, temp;
        int[] arr = { 55, 27, 13, 92, 11, 48, 75, 88, 5 };
        System.out.println("Array before Sorting: " + Arrays.toString(arr));

        // ascending order
        for (i = 0; i < arr.length - 1; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Array in ascending order after Sorting: " + Arrays.toString(arr));

        // descending order
        for (i = 0; i < arr.length - 1; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Array in descending order after Sorting: " + Arrays.toString(arr));
    }
}
