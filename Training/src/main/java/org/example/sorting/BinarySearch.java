package org.example.sorting;

public class BinarySearch {
    public static int binarySearch(int[] arr,int startIndex,int endIndex,int key){

//         Recursion Method
        if (endIndex >= startIndex){

            int mid = startIndex + (endIndex - startIndex) / 2;

            if (arr[mid] == key){
                return mid;
            }

            if (key <= arr[mid]){
                return binarySearch(arr,startIndex,mid - 1,key);
            }

            return binarySearch(arr,mid+1,endIndex,key);
        }

        return -1;

        // Iteration Method

//        while (endIndex >= startIndex){
//
//            int mid = startIndex + (endIndex -  startIndex) / 2;
//
//            if (key == arr[mid]){
//                return mid;
//            }
//
//            if (key <= arr[mid]){
//                endIndex = mid -1;
//            }
//
//            if (key >= arr[mid]){
//                startIndex = mid +1;
//            }
//        }
//
//        return -1;
    }
}
