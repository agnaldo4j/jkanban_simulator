package com.agnaldo4j.kanban.simulator.models;

import java.util.SortedSet;

public class Workflow extends Domain<Workflow> {

    private final Flow defaultFlow;
    private final SortedSet<Flow> flows;

    public Workflow(SortedSet<Flow> flows) {
        this.flows = flows;
        this.defaultFlow = new Flow(0, MemberAbility.None, "undefined");
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