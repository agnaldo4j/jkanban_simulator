package com.agnaldo4j.kanban.simulator.models;

import com.agnaldo4j.kanban.simulator.models.commands.Event;
import io.reactivex.Observer;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.UUID;

public class Flow extends Domain<Flow> implements Comparable<Flow> {

    private final int order;
    private final MemberAbility requiredAbility;
    private final String name;

    public Flow(int order, MemberAbility requiredAbility, String name, Observer<Event<Flow>> observer) {
        this(UUID.randomUUID().toString(), order, requiredAbility, name, observer);
    }

    public Flow(String id, int order, MemberAbility requiredAbility, String name, Observer<Event<Flow>> observer) {
        super(id, observer);
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
