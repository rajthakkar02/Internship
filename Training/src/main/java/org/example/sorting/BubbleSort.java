package org.example.sorting;

public class BubbleSort {
    public static void bubbleSort() {
        int[] arr = {7, 8, 1, 3, 2};

        // Bubble Sort
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) { // if ith index is greater than i+1 th index then it will swap the number
                    // swap number
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        printArr(arr);

    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
