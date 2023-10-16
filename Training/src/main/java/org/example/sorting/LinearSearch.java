package org.example.sorting;

import java.util.ArrayList;

public class LinearSearch {
    public static int search(ArrayList<Integer> list, int key){
        for (int i=0 ; i < list.size() ; i++){
            if (list.get(i) == key){
                return i;
            }
        }
        return -1;
    }
}
