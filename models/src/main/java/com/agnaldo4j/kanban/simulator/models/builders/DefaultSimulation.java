package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.Kanban;
import com.agnaldo4j.kanban.simulator.models.Project;
import com.agnaldo4j.kanban.simulator.models.Simulation;

import java.util.List;

public class DefaultSimulation implements Builder<Simulation> {

    private final Builder<List<Project>> projectsBuilder;
    private final Builder<Kanban> builder;

    public DefaultSimulation(Builder<Kanban> builder, Builder<List<Project>> projectsBuilder) {
        this.builder = builder;
        this.projectsBuilder = projectsBuilder;
    }

    public Simulation build() {
        return new Simulation(builder.build(), projectsBuilder.build());
    }
}
