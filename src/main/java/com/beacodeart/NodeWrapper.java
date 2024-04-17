package com.beacodeart;

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
