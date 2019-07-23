package com.agnaldo4j.kanban.simulator.models;

public class Kanban extends Domain {

    private final Workflow workflow;

    public Kanban(Workflow workflow) {
        this.workflow = workflow;
    }
}
