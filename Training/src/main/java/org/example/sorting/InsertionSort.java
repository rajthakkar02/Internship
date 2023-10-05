package org.example.sorting;

public class InsertionSort {
    public static void insertionSort() {
        int[] arr = {7,8,3,2,5};

        for (int i=1 ; i< arr.length ; i++){
            int current = arr[i]; // 8   3
            int j = i-1;  // 7   8
            while (j>= 0 && current < arr[j]){
                // 8 > 7 False  3<8 True
                arr[j+1] = arr[j];
                 j--;
            }
            arr[j+1] = current;  // position 1 = 8

        }

        printArr(arr);
    }

    public static void printArr(int[] arr){
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
