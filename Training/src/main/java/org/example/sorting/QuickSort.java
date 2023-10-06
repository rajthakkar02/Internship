package org.example.sorting;

public class QuickSort {

    public static void quickSort(int[] arr,int low,int high){
        if (low < high){
            int pivot = partition(arr,low,high);

            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }

    public static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int i = low-1;

        for (int j=low; j< high;j++){
            if (arr[j] < pivot){
                i++;

                // Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        //Swap pivot
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; //pivot index
    }
}
