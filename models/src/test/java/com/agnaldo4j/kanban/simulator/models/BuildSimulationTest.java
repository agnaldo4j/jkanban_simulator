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
                        new DefaultWorkflowStructure(),
                        new DefaultMembers()
                ),
                new DefaultProjects()
        ).build();
    }

    @Test
    public void we_can_buy_a_ticket_from_wroclaw_to_berlin_for_ten_euros() {
        assertEquals(0, this.simulation.backlogTasks().size());
    }
}
