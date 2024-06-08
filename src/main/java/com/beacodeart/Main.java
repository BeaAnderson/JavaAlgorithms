package com.beacodeart;

import java.util.List;

import com.beacodeart.binarsearch.BinarySearch;
import com.beacodeart.dfstree.DFS;
import com.beacodeart.dfstree.TreeNode;
import com.beacodeart.graph.DijkstrasGraph;
import com.beacodeart.graph.Dikstras;
import com.beacodeart.graph.Generator;
import com.beacodeart.graph.GraphNode;
import com.beacodeart.merge.MergeSort;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = { 1, 9, 2, 88, 5, 43 };

        MergeSort.mergeSort(arr1, 0, arr1.length - 1);

        for (int i : arr1) {
            System.out.println(i);
        }

        System.out.println(BinarySearch.binarsearch(arr1, 55));

        // TreeNode node4 = new TreeNode(98);
        // TreeNode node2 = new TreeNode(5, node4, null);
        // TreeNode node3 = new TreeNode(4);
        // TreeNode node1 = new TreeNode(1, node2, node3);

        // System.out.println(DFS.depthFirstSearch(node1, 98));

        // DijkstrasGraph graph = new DijkstrasGraph();

        // for (int i=0; i<1000; i++){
        //     graph.addNode(new GraphNode(i));
        // }

        // Generator.generateEdges(graph);

        // long startTime = System.nanoTime();
        // List<GraphNode> shortestPathList = Dikstras.DSP(graph, 0);
        // long endTime = System.nanoTime();

        // long executionTime = (endTime - startTime) / 1000000;

        // for (GraphNode node: shortestPathList){
        //     System.out.print("distance to node " + node.getData() + " equals " + node.getDist() + " previous node = ");
        //     if(node.getPrev()!=null){
        //         System.out.println(node.getPrev().getData());
        //     } else {
        //         System.out.println("null");
        //     }
        // }

        // System.out.println(shortestPathList.size());
        // System.out.println("DSP Execution time: " + executionTime + "ms");

        
        // graph.print();

        // DFSAdj.dfsAdj(graph, 0);

        // System.out.println("------------BFS-------------");

        // BFSAdj.BFS(graph, 0);
        
    }
}