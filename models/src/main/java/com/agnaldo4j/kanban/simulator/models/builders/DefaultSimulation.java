package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.Kanban;
import com.agnaldo4j.kanban.simulator.models.Member;
import com.agnaldo4j.kanban.simulator.models.Project;
import com.agnaldo4j.kanban.simulator.models.Simulation;

import java.util.List;
import java.util.SortedSet;

public class DefaultSimulation implements Builder<Simulation> {

    private final Builder<SortedSet<Project>> projectsBuilder;
    private Builder<List<Member>> membersBuilder;
    private final Builder<Kanban> builder;

    public DefaultSimulation(Builder<Kanban> builder, Builder<SortedSet<Project>> projectsBuilder, Builder<List<Member>> membersBuilder) {
        this.builder = builder;
        this.projectsBuilder = projectsBuilder;
        this.membersBuilder = membersBuilder;
    }

    public Simulation build() {
        return new Simulation(builder.build(), projectsBuilder.build(), membersBuilder.build());
    }
}
