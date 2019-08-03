package com.agnaldo4j.kanban.simulator.models;

import java.util.ArrayList;
import java.util.List;

public class Kanban extends Domain<Kanban> {

    private final Workflow workflow;
    private final List<Member> members;
    private final List<Task> tasks;

    public Kanban(Workflow workflow, List<Member> members) {
        this.workflow = workflow;
        this.members = members;
        this.tasks = new ArrayList<>();
    }

    public int backlogTasks() {
        return workflow.numberOfTasksInBacklog();
    }

    public int numberOfTasksInFlows() {
        return this.workflow.numberOfTasks();
    }
}
