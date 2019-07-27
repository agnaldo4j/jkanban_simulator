package com.agnaldo4j.kanban.simulator.models;

import com.agnaldo4j.kanban.simulator.models.commands.Event;
import io.reactivex.Observer;

import java.util.List;
import java.util.SortedSet;

public class Simulation extends Domain<Simulation> {

    private final List<Project> projects;
    private final Kanban kanban;
    public String name;

    public Simulation(Kanban kanban, List<Project> projects, Observer<Event<Simulation>> observer) {
        super(observer);
        this.kanban = kanban;
        this.projects = projects;
    }

    public SortedSet<Task> backlogTasks() {
        return this.kanban.backlogTasks();
    }

    public String helloGradle() {
        return "Hello Gradle!";
    }
}
