package org.example.sorting;

import java.util.ArrayList;

public class BinarySearch {
    public static int binarySearch(ArrayList<Integer> list, int startIndex, int endIndex, int key){

//         Recursion Method
        if (endIndex >= startIndex){

            int mid = startIndex + (endIndex - startIndex) / 2;

            if (list.get(mid) == key){
                return mid;
            }

            if (key <= list.get(mid)){
                return binarySearch(list,startIndex,mid - 1,key);
            }

            return binarySearch(list,mid+1,endIndex,key);
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
