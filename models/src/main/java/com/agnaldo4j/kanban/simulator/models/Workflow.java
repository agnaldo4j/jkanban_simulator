package com.agnaldo4j.kanban.simulator.models;

import java.util.SortedSet;

public class Workflow extends Domain {

    private final SortedSet<Flow> flows;

    public Workflow(SortedSet<Flow> flows) {
        this.flows = flows;
    }
}