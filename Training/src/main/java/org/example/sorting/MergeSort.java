package org.example.sorting;

public class MergeSort {
    public static void divide(int[] arr,int startIndex , int endIndex){
        if (startIndex == endIndex){
            return;
        }

         int mid = (startIndex + endIndex) / 2;

         divide(arr,startIndex,mid);
         divide(arr,mid+1,endIndex);
         conquer(arr,startIndex,mid,endIndex);


    }
    public static void conquer(int[] arr,int startIndex , int mid ,int endIndex){
        int[] merged = new int[endIndex - startIndex + 1];
        int idx1 = startIndex;
        int idx2 = mid+1;
        int x = 0;

        while (idx1 <= mid && idx2 <= endIndex){
            if (arr[idx1] <= arr[idx2]){
                merged[x] = arr[idx1];
                x++;
                idx1++;
            }else {
                merged[x] = arr[idx2];
                x++;
                idx2++;
            }
        }

        while (idx1 <= mid){
            merged[x] = arr[idx1];
            x++;
            idx1++;
        }

        while (idx2 <= endIndex){
            merged[x] = arr[idx2];
            x++;
            idx2++;
        }

        for (int i=0 , j=startIndex ; i< merged.length ; i++,j++){
            arr[j] = merged[i];
        }
    }
}
