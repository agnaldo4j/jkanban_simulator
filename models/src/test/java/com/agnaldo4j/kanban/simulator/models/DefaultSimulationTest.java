package com.agnaldo4j.kanban.simulator.models;

import com.agnaldo4j.kanban.simulator.models.builders.*;
import org.junit.jupiter.api.BeforeEach;

public class DefaultSimulationTest {
    protected Simulation simulation;

    @BeforeEach
    public void buildSimulation() {
        this.simulation = new DefaultSimulation(
                new DefaultKanbanBoard(),
                new DefaultProjects(),
                new DefaultMembers(),
                new DefaultDays()
        ).build();
    }
}
