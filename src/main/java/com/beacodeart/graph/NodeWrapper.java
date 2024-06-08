package com.beacodeart.graph;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class NodeWrapper {
    private GraphNode node;
    private double edge;
}
