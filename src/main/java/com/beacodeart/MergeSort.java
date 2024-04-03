package com.beacodeart;

public class MergeSort {

    private static void merge(int[] arr, int start, int mid, int end) {
        int sizeleft = (mid-start)+1;
        int sizeright = (end-mid);

        int[] leftArr = new int[sizeleft];
        int[] rightArr = new int[sizeright];

        int iterator = 0;

        while (iterator<sizeleft) {
            leftArr[iterator] = arr[start+iterator];
            iterator++;
        }

        while (iterator<(end-start+1)){
            rightArr[iterator-sizeleft] = arr[start+iterator];
            iterator++;
        }

        int rightpointer = 0;
        int leftpointer = 0;
        int arrpointer = start;

        while (rightpointer<rightArr.length && leftpointer<leftArr.length) {
            if (rightArr[rightpointer]<leftArr[leftpointer]){
                arr[arrpointer] = rightArr[rightpointer];
                arrpointer++;
                rightpointer++;
            } else {
                arr[arrpointer] = leftArr[leftpointer];
                arrpointer++;
                leftpointer++;
            }
        }

        while (rightpointer<rightArr.length) {
            arr[arrpointer] = rightArr[rightpointer];
            arrpointer++;
            rightpointer++;
        }
        while (leftpointer<leftArr.length) {
            arr[arrpointer] = leftArr[leftpointer];
            arrpointer++;
            leftpointer++;
        }

    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (end<=start){
            return;
        }

        int midpoint = (start+end)/2;

        mergeSort(arr, start, midpoint);
        
        mergeSort(arr, midpoint+1, end);
        
        merge(arr, start, midpoint, end);
    }
}
