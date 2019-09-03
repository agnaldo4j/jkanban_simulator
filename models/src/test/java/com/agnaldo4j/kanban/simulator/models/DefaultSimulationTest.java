package com.agnaldo4j.kanban.simulator.models;

import com.agnaldo4j.kanban.simulator.models.builders.DefaultDays;
import com.agnaldo4j.kanban.simulator.models.builders.DefaultKanbanBoard;
import com.agnaldo4j.kanban.simulator.models.builders.DefaultMembers;
import com.agnaldo4j.kanban.simulator.models.builders.DefaultProjects;
import com.agnaldo4j.kanban.simulator.models.builders.DefaultSimulation;
import org.junit.jupiter.api.BeforeEach;

public class DefaultSimulationTest {
    protected Simulation simulation;

    @BeforeEach
    public void buildSimulation() {
        this.simulation = new DefaultSimulation(
                new DefaultKanbanBoard(),
                new DefaultProjects(),
                new DefaultMembers(),
                new DefaultDays(new ConstantEffortGenerator())
        ).build();
    }
}
