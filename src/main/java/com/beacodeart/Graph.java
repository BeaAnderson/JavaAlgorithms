package com.beacodeart;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    
    ArrayList<LinkedList<GraphNode>> alist;

    public Graph() {
       alist = new ArrayList<>();
    }

    public void addNode(GraphNode node){
        LinkedList<GraphNode> currentlist = new LinkedList<>();
        currentlist.add(node);
        alist.add(currentlist);
    }

    public void addEdge(int src, int dst){
        LinkedList<GraphNode> currentList = alist.get(src);
        GraphNode dstNode = alist.get(dst).get(0);
        currentList.add(dstNode);
    }

    public boolean checkEdge(int src, int dst){
        LinkedList<GraphNode> currentList = alist.get(src);
        GraphNode dstNode = alist.get(dst).get(0);

        for (GraphNode node: currentList){
            if (node == dstNode){
                return true;
            }
        }

        return false;
    }

    public void print(){
        for(LinkedList<GraphNode> currentList: alist){
            for(GraphNode node: currentList){
                System.out.print(node.data + "->");
            }
            System.out.println();
        }
    }

}
