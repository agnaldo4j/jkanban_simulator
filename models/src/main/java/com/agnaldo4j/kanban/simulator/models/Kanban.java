package com.agnaldo4j.kanban.simulator.models;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;

public class Kanban extends Domain<Kanban> {

    private final Workflow workflow;
    private final List<Member> members;
    private final List<Task> tasks;

    public Kanban(Workflow workflow, List<Member> members) {
        this.workflow = workflow;
        this.members = members;
        this.tasks = new ArrayList<>();
    }

    public SortedSet<Task> backlogTasks() {
        return workflow.backlogTasks();
    }
}
