package com.beacodeart;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 9, 2, 88, 5, 43};

        MergeSort.mergeSort(arr1, 0, arr1.length-1);

        for(int i: arr1){
            System.out.println(i);
        }
    }
}