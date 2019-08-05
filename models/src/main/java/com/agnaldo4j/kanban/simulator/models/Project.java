package com.agnaldo4j.kanban.simulator.models;

import java.util.List;

public class Project extends Domain<Project> {

    private static final long serialVersionUID = 3344189040534770877L;

    private final double income;
    private final List<Task> tasks;

    public Project(double income, List<Task> tasks) {
        this.income = income;
        this.tasks = tasks;
    }
}
