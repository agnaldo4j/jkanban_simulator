package com.agnaldo4j.kanban.simulator.models;

import com.agnaldo4j.kanban.simulator.models.commands.Event;
import io.reactivex.Observer;

import java.util.List;

public class Project extends Domain<Project> {

    private final double income;
    private final List<Task> tasks;

    public Project(double income, List<Task> tasks, Observer<Event<Project>> observer) {
        super(observer);
        this.income = income;
        this.tasks = tasks;
    }
}
