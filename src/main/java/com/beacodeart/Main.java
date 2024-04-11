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

        Graph graph = new Graph();

        graph.addNode(new GraphNode(0));
        graph.addNode(new GraphNode(1));
        graph.addNode(new GraphNode(2));
        graph.addNode(new GraphNode(3));
        graph.addNode(new GraphNode(4));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();

        DFSAdj.dfsAdj(graph, 0);

        System.out.println("------------BFS-------------");

        BFSAdj.BFS(graph, 0);
    }
}