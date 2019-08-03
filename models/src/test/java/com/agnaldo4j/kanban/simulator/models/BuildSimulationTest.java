package com.agnaldo4j.kanban.simulator.models;

import com.agnaldo4j.kanban.simulator.models.builders.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuildSimulationTest  {

    private Simulation simulation;

    @BeforeEach
    public void buildSimulation() {
        this.simulation = new DefaultSimulation(
                new DefaultKanbanBoard(
                        new DefaultMembers()
                ),
                new DefaultProjects()
        ).build();
    }

    @Test
    public void kanban_board_must_be_empty() {
        assertEquals(0, this.simulation.numberOfTasksOnKanbanBoard());
    }
}
