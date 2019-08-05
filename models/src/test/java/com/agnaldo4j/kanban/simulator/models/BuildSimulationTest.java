package com.agnaldo4j.kanban.simulator.models;

import com.agnaldo4j.kanban.simulator.models.builders.DefaultKanbanBoard;
import com.agnaldo4j.kanban.simulator.models.builders.DefaultMembers;
import com.agnaldo4j.kanban.simulator.models.builders.DefaultProjects;
import com.agnaldo4j.kanban.simulator.models.builders.DefaultSimulation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuildSimulationTest  {

    private Simulation simulation;

    @BeforeEach
    public void buildSimulation() {
        this.simulation = new DefaultSimulation(
                new DefaultKanbanBoard(),
                new DefaultProjects(),
                new DefaultMembers()
        ).build();
    }

    @Test
    public void kanban_board_must_be_empty() {
        assertEquals(0, this.simulation.numberOfTasksOnKanbanBoard());
    }

    @Test
    public void simulation_with_default_projects() {
        assertEquals(9, simulation.numberOfDefaultProjects());
    }

    @Test
    public void simulation_with_default_members() {
        assertEquals(4, simulation.numberOfMembers());
    }

    @Test
    public void simulation_number_of_analysts() {
        assertEquals(1, simulation.numberOfAnalysts());
    }

    @Test
    public void simulation_number_of_developers() {
        assertEquals(2, simulation.numberOfDevelopers());
    }

    @Test
    public void simulation_number_of_qas() {
        assertEquals(1, simulation.numberOfQAs());
    }
}
