package com.agnaldo4j.kanban.simulator.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuildSimulationTest extends DefaultSimulationTest {

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
    public void simulation_number_of_developers() { assertEquals(2, simulation.numberOfDevelopers()); }

    @Test
    public void simulation_number_of_qas() {
        assertEquals(1, simulation.numberOfQAs());
    }

    @Test
    public void members_working_on_analysis() {
        assertEquals(1, this.simulation.numberOfAnalysts());
    }

    @Test
    public void members_working_on_development() {
        assertEquals(2, this.simulation.numberOfDevelopers());
    }

    @Test
    public void members_working_on_qas() {
        assertEquals(1, this.simulation.numberOfQAs());
    }
}
