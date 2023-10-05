package org.example.sorting;

public class SelectionSort {

    public static void selectionSort() {

        int[] arr = {7,8,3,1,2};


        for (int i=0 ; i< arr.length-1 ; i++){
            int smallest = i;
            for (int j=i+1 ; j< arr.length ; j++){
                if (arr[smallest] > arr[j]){
                    // Smallest element greater than j then take index of j . And from that search the next smallest element
                    smallest = j;
                }
            }
            // When we find the smallest element then we will swap it.
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }


        printArr(arr);
    }

    public static void printArr(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }



}
