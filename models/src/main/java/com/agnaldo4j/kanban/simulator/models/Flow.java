package com.agnaldo4j.kanban.simulator.models;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.UUID;

public class Flow extends Domain<Flow> implements Comparable<Flow> {

    private final int order;
    private final MemberAbility requiredAbility;
    private final String name;

    public Flow(int order, MemberAbility requiredAbility, String name) {
        this(UUID.randomUUID().toString(), order, requiredAbility, name);
    }

    public Flow(String id, int order, MemberAbility requiredAbility, String name) {
        super(id);
        this.order = order;
        this.requiredAbility = requiredAbility;
        this.name = name;
    }

    public int order() {
        return this.order;
    }

    public SortedSet<Task> tasks() {
        return new TreeSet<>();
    }

    @Override
    public int compareTo(Flow other) {
        return this.order > other.order ? 1 : -1;
    }
}
