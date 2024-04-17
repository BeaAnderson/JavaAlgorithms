package com.beacodeart;

import java.util.ArrayList;
import java.util.LinkedList;

public class DijkstrasGraph {
    ArrayList<LinkedList<NodeWrapper>> alist;

    public DijkstrasGraph() {
       alist = new ArrayList<>();
    }

    public void addNode(GraphNode node){
        LinkedList<NodeWrapper> currentlist = new LinkedList<>();
        currentlist.add(new NodeWrapper(node, 0));
        alist.add(currentlist);
    }

    public void addEdge(int src, int dst, int edge){
        LinkedList<NodeWrapper> currentList = alist.get(src);
        GraphNode dstNode = alist.get(dst).get(0).getNode();
        currentList.add(new NodeWrapper(dstNode, edge));
    }

    public boolean checkEdge(int src, int dst){
        LinkedList<NodeWrapper> currentList = alist.get(src);
        GraphNode dstNode = alist.get(dst).get(0).getNode();

        for (NodeWrapper node: currentList){
            if (node.getNode() == dstNode){
                return true;
            }
        }

        return false;
    }

    public void print(){
        for(LinkedList<NodeWrapper> currentList: alist){
            for(NodeWrapper node: currentList){
                System.out.print(node.getNode().data + "->");
            }
            System.out.println();
        }
    }
}
