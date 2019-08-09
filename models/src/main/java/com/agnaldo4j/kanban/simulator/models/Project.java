package com.agnaldo4j.kanban.simulator.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.Collections;
import java.util.List;

@Accessors(fluent = true)
public class Project extends Domain<Project> implements Comparable<Project> {

    private static final long serialVersionUID = 3344189040534770877L;

    @Getter(AccessLevel.PUBLIC)
    private final int order;

    @Getter(AccessLevel.PUBLIC)
    private final double income;
    private final List<Task> tasks;

    public Project(int order, double income, List<Task> tasks) {
        this.order = order;
        this.income = income;
        this.tasks = tasks;
    }

    public List<Task> tasks() {
        return Collections.unmodifiableList(this.tasks);
    }

    @Override
    public int compareTo(Project project) {
        if (this.order < project.order) return -1;
        else if (this.order > project.order) return 1;
        else return 0;
    }
}
