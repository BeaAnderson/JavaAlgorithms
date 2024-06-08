package com.beacodeart.graph;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GraphNode {
    int data;
    double dist;
    GraphNode prev;
    Boolean known;

    public GraphNode(int data) {
        this.data = data;
        this.dist = Double.POSITIVE_INFINITY;
        this.prev = null;
        this.known = false;
    }
}
