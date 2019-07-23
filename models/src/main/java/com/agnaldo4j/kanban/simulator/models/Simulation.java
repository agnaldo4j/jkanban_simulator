package com.agnaldo4j.kanban.simulator.models;

public class Simulation extends Domain {

    private final Kanban kanban;
    public String name;

    public Simulation(Kanban kanban) {
        this.kanban = kanban;
    }

    public String helloGradle() {
        return "Hello Gradle!";
    }
}
