package com.agnaldo4j.kanban.simulator.models;

public class Task extends Domain<Task> {

    private final TaskType taskType;
    private final Flow currentFlow;
    private final int effort;

    public Task(TaskType taskType, Flow currentFlow, int effort) {
        this.taskType = taskType;
        this.currentFlow = currentFlow;
        this.effort = effort;
    }
}
