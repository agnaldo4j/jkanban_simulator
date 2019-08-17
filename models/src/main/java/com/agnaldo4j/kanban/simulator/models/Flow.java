package com.agnaldo4j.kanban.simulator.models;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.UUID;

public class Flow extends Domain<Flow> {

    private static final long serialVersionUID = 2054257246011782724L;

    private final String name;
    private final SortedSet<Task> tasks;

    public Flow(String name) {
        this(UUID.randomUUID().toString(), name);
    }

    public Flow(String id, String name) {
        super(id);
        this.name = name;
        this.tasks = new TreeSet<>();
    }

    public SortedSet<Task> tasks() {
        return this.tasks;
    }

    public void addTask(Task task) {
        if(this.tasks.size() > 0) {
            Task lastTask = this.tasks.last();
            task.changeOrder(lastTask.order() + 1);
        }
        this.tasks.add(task);
    }

    public void removeTask(Task task) {
        if (this.tasks.contains(task))
            this.tasks.remove(task);
    }
}
