package com.beacodeart.binarsearch;

public class BinarySearch {
    public static int binarsearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int midpoint = getMidpoint(start, end);

        while (end>=start){
            if(arr[midpoint]==target){
                return midpoint;
            } else if (arr[midpoint]>target){
                end=midpoint-1;
                midpoint=getMidpoint(start, end);
            } else {
                start=midpoint+1;
                midpoint=getMidpoint(start, end);
            }
        }

        return -1;
    
    }
    private static int getMidpoint(int start, int end) {
        return start + (end-start)/2;
    }
}
