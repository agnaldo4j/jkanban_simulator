package com.agnaldo4j.kanban.simulator.models;

import java.util.List;

public class Project extends Domain<Project>  implements Comparable<Project> {

    private static final long serialVersionUID = 3344189040534770877L;

    private final int order;
    private final double income;
    private final List<Task> tasks;

    public Project(int order, double income, List<Task> tasks) {
        this.order = order;
        this.income = income;
        this.tasks = tasks;
    }

    public int order() {
        return this.order;
    }

    @Override
    public int compareTo(Project project) {
        if (this.order < project.order) return -1;
        else if (this.order > project.order) return 1;
        else return 0;
    }
}
