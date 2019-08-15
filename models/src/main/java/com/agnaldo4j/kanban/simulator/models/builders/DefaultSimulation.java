package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.*;

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
        Simulation simulation = new Simulation(builder.build(), projectsBuilder.build(), membersBuilder.build());
        simulation
                .membersByAbility(MemberAbility.Analyst)
                .forEach(member -> simulation.addWorkOnAnalysis(member));
        simulation
                .membersByAbility(MemberAbility.Developer)
                .forEach(member -> simulation.addWorkOnDevelopment(member));
        simulation
                .membersByAbility(MemberAbility.QualityAssurance)
                .forEach(member -> simulation.addWorkOnQualityAssurance(member));

        return simulation;
    }
}
