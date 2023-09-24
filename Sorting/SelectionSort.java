package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int i, j, minPos, temp;
        int[] arr = { 55, 27, 13, 92, 11, 48, 75, 88, 5 };
        System.out.println("Array before Sorting: " + Arrays.toString(arr));

        // ascending order

        for (i = 0; i < arr.length - 1; i++) {
            minPos = i;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minPos])
                    minPos = j;
            }
            temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
        System.out.println("Array (asc) after Sorting: " + Arrays.toString(arr));

        // descending order

        for (i = 0; i < arr.length - 1; i++) {
            minPos = i;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[minPos])
                    minPos = j;
            }
            temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
        System.out.println("Array (desc) after Sorting: " + Arrays.toString(arr));
    }
}
