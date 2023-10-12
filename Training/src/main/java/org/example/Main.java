package org.example;

import org.example.sorting.*;

public class Main {
    public static void main(String[] args) {
        BubbleSort.bubbleSort();
        SelectionSort.selectionSort();
        InsertionSort.insertionSort();

        //Quick Sort
        int[] arr = {6,3,5,9,2,8};
        int n = arr.length;

        QuickSort.quickSort(arr,0,n-1);

        printArr(arr);

        //Merge Sort
        int[] arr1 = {6,11,2,8,5,9,7};
        n = arr1.length;

        MergeSort.divide(arr1,0,n-1);

        printArr(arr1);

        //Linear Search

        int[] arr2 = {10,20,30,40,50,60};
        int key = 40;

        int result = LinearSearch.search(arr2,key);

        if (result == -1){
            System.out.println("Key Not founded");
        }else {
            System.out.println("Key Found "+result);
        }

        //Binary Search
        n = arr2.length;
        System.out.println("Key Found at index " +BinarySearch.binarySearch(arr2,0,n-1,40));
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}