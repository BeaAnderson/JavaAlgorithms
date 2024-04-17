package com.beacodeart;

import java.util.List;

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

        DijkstrasGraph graph = new DijkstrasGraph();

        graph.addNode(new GraphNode(0));
        graph.addNode(new GraphNode(1));
        graph.addNode(new GraphNode(2));
        graph.addNode(new GraphNode(3));
        graph.addNode(new GraphNode(4));

        graph.addEdge(0, 1, 3);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 4, 5);
        graph.addEdge(2, 3, 1);
        graph.addEdge(2, 4, 3);
        graph.addEdge(4, 0, 9);
        graph.addEdge(4, 2, 11);

        List<GraphNode> shortestPathList = Dikstras.DSP(graph, 0);
        for (GraphNode node: shortestPathList){
            System.out.print("distance to node " + node.data + " equals " + node.dist + " previous node = ");
            if(node.prev!=null){
                System.out.println(node.prev.data);
            } else {
                System.out.println("null");
            }
        }

        // graph.print();

        // DFSAdj.dfsAdj(graph, 0);

        // System.out.println("------------BFS-------------");

        // BFSAdj.BFS(graph, 0);
    }
}