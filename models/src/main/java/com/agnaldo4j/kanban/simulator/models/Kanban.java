package com.agnaldo4j.kanban.simulator.models;

public class Kanban extends Domain<Kanban> {

    private static final long serialVersionUID = -4443681766733527698L;

    private final Workflow workflow;

    public Kanban(Workflow workflow) {
        this.workflow = workflow;
    }

    public int backlogTasks() {
        return workflow.numberOfTasksInBacklog();
    }

    public int numberOfTasksInFlows() {
        return this.workflow.numberOfTasks();
    }
}
