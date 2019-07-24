package com.agnaldo4j.kanban.simulator.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Flow extends Domain implements Comparable<Flow> {

    private final int order;
    private final String name;
    private final List<Member> members;

    public Flow(int order, String name) {
        this(UUID.randomUUID().toString(), order, name, new ArrayList<>());
    }

    public Flow(int order, String name, List<Member> members) {
        this(UUID.randomUUID().toString(), order, name, members);
    }

    public Flow(String id, int order, String name, List<Member> members) {
        super(id);
        this.order = order;
        this.name = name;
        this.members = members;
    }

    @Override
    public int compareTo(Flow other) {
        return this.order > other.order ? 1 : -1;
    }
}
