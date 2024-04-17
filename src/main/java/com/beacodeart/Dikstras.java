package com.beacodeart;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Dikstras {
    public static List<GraphNode> DSP(DijkstrasGraph graph, int source){
        
        NodeWrapper wrapper = graph.alist.get(source).get(0);
        GraphNode node = wrapper.getNode();
        node.setDist(0);
        List<GraphNode> knownShortestPath = new ArrayList<>();
        

        List<GraphNode> nodesWeCanGetTo = new ArrayList<>();
        nodesWeCanGetTo.add(node);

        while (!nodesWeCanGetTo.isEmpty()) {
            GraphNode minNode = null;
            for (GraphNode currnode: nodesWeCanGetTo){
                if(minNode==null){
                    minNode=currnode;
                } else if (currnode.getDist()<minNode.getDist()){
                    minNode=currnode;
                }
            }
            knownShortestPath.add(minNode);
            minNode.known=true;
            nodesWeCanGetTo.remove(minNode);
            List<NodeWrapper> nodesInAdjListOfMin = relax(graph.alist.get(minNode.data), minNode);
            for (NodeWrapper currNode: nodesInAdjListOfMin){
                if(currNode.getNode().data!=minNode.data && !currNode.getNode().known && !nodesWeCanGetTo.contains(currNode.getNode())){
                    nodesWeCanGetTo.add(currNode.getNode());
                }
            }
        }

        

        return knownShortestPath;
    }

    private static List<NodeWrapper> relax(LinkedList<NodeWrapper> linkedList, GraphNode currentNode) {
        for (NodeWrapper currWrapper: linkedList){
            if(currWrapper.getNode().data != currentNode.data){
                if (currWrapper.getNode().dist>currentNode.dist+currWrapper.getEdge()){
                    currWrapper.getNode().dist=currentNode.dist+currWrapper.getEdge();
                    currWrapper.getNode().prev=currentNode;
                }
            }
        }
        return linkedList;
    }
}
