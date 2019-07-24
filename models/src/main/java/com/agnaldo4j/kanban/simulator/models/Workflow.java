package com.agnaldo4j.kanban.simulator.models;

import java.util.SortedSet;

public class Workflow extends Domain {

    private final Flow defaultFlow = new Flow(0, MemberAbility.None, "undefined");
    private final SortedSet<Flow> flows;

    public Workflow(SortedSet<Flow> flows) {
        this.flows = flows;
    }

    public SortedSet<Task> backlogTasks() {
        return flows
                .stream()
                .filter(flow -> flow.order() == 1)
                .findFirst()
                .orElse(defaultFlow)
                .tasks();
    }
}