package com.beacodeart;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = { 1, 9, 2, 88, 5, 43 };

        MergeSort.mergeSort(arr1, 0, arr1.length - 1);

        for (int i : arr1) {
            System.out.println(i);
        }

        TreeNode node4 = new TreeNode(98);
        TreeNode node2 = new TreeNode(5, node4, null);
        TreeNode node3 = new TreeNode(4);
        TreeNode node1 = new TreeNode(1, node2, node3);

        System.out.println(DFS.depthFirstSearch(node1, 98));
    }
}