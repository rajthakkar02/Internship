package org.example.sorting;

public class QuickSort {

    public static void quickSort(int[] arr,int low,int high){
        if (low >= high){
            return;
          
        }
        int pivot = partition(arr,low,high);

        quickSort(arr,low,pivot-1);
        quickSort(arr,pivot+1,high);
    }

    public static int partition(int[] arr,int low,int high){
        int i = low-1;

        for (int j=low; j< high;j++){
            if (!(arr[j] < arr[high])){
                continue;
            }
            i++;

            // Swap
            swap(arr, i, j);
        }
        i++;

        //Swap pivot
        swap(arr, i, high);

        return i; //pivot index
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
