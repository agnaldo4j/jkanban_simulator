package com.agnaldo4j.kanban.simulator.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
public class VirtualDay extends Domain<VirtualDay> implements Comparable<VirtualDay> {
    private static final long serialVersionUID = 6646626463880156674L;

    @Getter(AccessLevel.PUBLIC)
    private final int order;

    public VirtualDay(int order) {
        this.order= order;
    }

    @Override
    public int compareTo(VirtualDay day) {
        if (this.order < day.order) return -1;
        else if (this.order > day.order) return 1;
        else return 0;
    }
}
