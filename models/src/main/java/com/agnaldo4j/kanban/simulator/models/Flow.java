package com.agnaldo4j.kanban.simulator.models;

import java.util.UUID;

public class Flow extends Domain implements Comparable<Flow> {

    private final int order;
    private final String name;

    public Flow(int order, String name) {
        this(order, name, UUID.randomUUID().toString());
    }

    public Flow(int order, String name, String id) {
        super(id);
        this.order = order;
        this.name = name;
    }

    @Override
    public int compareTo(Flow other) {
        return this.order > other.order ? 1 : -1;
    }
}
