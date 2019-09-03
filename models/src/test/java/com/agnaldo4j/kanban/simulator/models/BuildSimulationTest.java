package com.agnaldo4j.kanban.simulator.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuildSimulationTest extends DefaultSimulationTest {

    @Test
    public void kanbanBoardMustBeEmpty() {
        assertEquals(0, this.simulation.numberOfTasksOnKanbanBoard());
    }

    @Test
    public void simulationWithDefaultProjects() {
        assertEquals(9, simulation.numberOfDefaultProjects());
    }

    @Test
    public void simulationWithDefaultMembers() {
        assertEquals(4, simulation.numberOfMembers());
    }

    @Test
    public void simulationNumberOfAnalysts() {
        assertEquals(1, simulation.numberOfAnalysts());
    }

    @Test
    public void simulationNumberOfDevelopers() { assertEquals(2, simulation.numberOfDevelopers()); }

    @Test
    public void simulationNumberOfQas() {
        assertEquals(1, simulation.numberOfQAs());
    }

    @Test
    public void membersWorkingOnAnalysis() {
        assertEquals(1, this.simulation.numberOfAnalysts());
    }

    @Test
    public void membersWorkingOnDevelopment() {
        assertEquals(2, this.simulation.numberOfDevelopers());
    }

    @Test
    public void membersWorkingOnQas() {
        assertEquals(1, this.simulation.numberOfQAs());
    }
}
