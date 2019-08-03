package com.agnaldo4j.kanban.simulator.models;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.UUID;

public class Flow extends Domain<Flow> {

    private final String name;

    public Flow(String name) {
        this(UUID.randomUUID().toString(), name);
    }

    public Flow(String id, String name) {
        super(id);
        this.name = name;
    }

    public SortedSet<Task> tasks() {
        return new TreeSet<>();
    }
}
