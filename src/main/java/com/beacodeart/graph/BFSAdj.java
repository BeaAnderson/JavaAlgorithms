package com.beacodeart.graph;

import java.util.Arrays;
import java.util.LinkedList;

public class BFSAdj {
    
    public static void BFS(Graph graph, int value){
        boolean[] seen = new boolean[graph.alist.size()];
        
        Arrays.fill(seen, false);
        
        GraphNode node = graph.alist.get(value).get(0);
        seen[node.data] = true;
        
        LinkedList<GraphNode> list = new LinkedList<>();
        list.add(node);

        while (!list.isEmpty()) {
            GraphNode localnode = list.remove();

            System.out.print(localnode.data + "->");
            LinkedList<GraphNode> localList = graph.alist.get(localnode.data);

            

            for (GraphNode node2: localList){

                if (!seen[node2.data]){
                    seen[node2.data] = true;
                    list.add(node2);
                }
            }

        }
    }
}
