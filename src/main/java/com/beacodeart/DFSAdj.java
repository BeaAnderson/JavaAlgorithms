package com.beacodeart;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class DFSAdj {
    
    public static void dfsAdj(Graph graph, int start){
        boolean[] visited = new boolean[graph.alist.size()];
        
        // explicitly false
        Arrays.fill(visited, false);
        
        Stack<GraphNode> stack = new Stack<>();
        GraphNode startNode = graph.alist.get(start).get(0);

        stack.add(startNode);
        visited[startNode.data] = true;


        while(!stack.isEmpty()){
            GraphNode node = stack.pop();
            System.out.print(node.data + "->");
            LinkedList<GraphNode> list = graph.alist.get(node.data);

            for (GraphNode currNode: list){
                if(!visited[currNode.data]){
                    visited[currNode.data] = true;
                    stack.add(currNode);
                }
            }
        }
        System.out.println("");
    }
}
