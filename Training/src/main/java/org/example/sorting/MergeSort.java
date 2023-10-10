package org.example.sorting;

public class MergeSort {
    public static void divide(int[] arr,int startIndex , int endIndex){
        if (startIndex == endIndex){
            return;
        }

         int mid = startIndex + (endIndex - startIndex) / 2;

         divide(arr,startIndex,mid);
         divide(arr,mid+1,endIndex);
         conquer(arr,startIndex,mid,endIndex);


    }
    public static void conquer(int[] arr,int si , int mid ,int ei){
        int[] merged = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei){
            if (arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            }else {
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid){
            merged[x++] = arr[idx1++];
        }

        while (idx2 <= ei){
            merged[x++] = arr[idx2++];
        }
    }
}
