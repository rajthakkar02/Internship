package org.example;

import org.example.sorting.*;

public class Main {
    public static void main(String[] args) {
        BubbleSort.bubbleSort();
        SelectionSort.selectionSort();
        InsertionSort.insertionSort();


        int[] arr = {6,3,5,9,2,8};
        int n = arr.length;

        QuickSort.quickSort(arr,0,n-1);

        printArr(arr);

        MergeSort.divide(arr,0,n-1);

        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}