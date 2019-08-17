package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.*;

import java.util.List;
import java.util.SortedSet;

public class DefaultSimulation implements Builder<Simulation> {

    private final Builder<SortedSet<Project>> projectsBuilder;
    private Builder<List<Member>> membersBuilder;
    private final Builder<Kanban> kanbanBuilder;
    private final Builder<SortedSet<VirtualDay>> daysBuilder;

    public DefaultSimulation(
            Builder<Kanban> kanbanBuilder,
            Builder<SortedSet<Project>> projectsBuilder,
            Builder<List<Member>> membersBuilder,
            Builder<SortedSet<VirtualDay>> daysBuilder) {
        this.kanbanBuilder = kanbanBuilder;
        this.projectsBuilder = projectsBuilder;
        this.membersBuilder = membersBuilder;
        this.daysBuilder = daysBuilder;
    }

    public Simulation build() {
        Simulation simulation = new Simulation(
                kanbanBuilder.build(),
                projectsBuilder.build(),
                membersBuilder.build(),
                daysBuilder.build());
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
