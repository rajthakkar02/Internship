package org.example.sorting;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {7,8,3,1,2};


        for (int i=0 ; i< arr.length-1 ; i++){
            int smallest = i;
            for (int j=i+1 ; j< arr.length ; j++){
                if (arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
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

    }



}
