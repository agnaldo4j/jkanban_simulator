package com.agnaldo4j.kanban.simulator.models;

import com.agnaldo4j.kanban.simulator.models.commands.Event;
import io.reactivex.Observer;

public class Task extends Domain<Task> {

    private final TaskType taskType;
    private final Flow currentFlow;
    private final int effort;

    public Task(TaskType taskType, Flow currentFlow, int effort, Observer<Event<Task>> observer) {
        super(observer);
        this.taskType = taskType;
        this.currentFlow = currentFlow;
        this.effort = effort;
    }
}
