package com.agnaldo4j.kanban.simulator.models;

import org.junit.jupiter.api.Test;

import java.util.SortedSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProjectOptionsSimulationTest extends DefaultSimulationTest {

    @Test
    public void giveProjectOptionsToWork() {
        assertEquals(9, simulation.numberOfDefaultProjects());

        givenProjectsToWorkFirstInteraction();
        givenProjectsToWorkSecondInteraction();
        givenProjectsToWorkThirdInteraction();

        assertEquals(0, simulation.numberOfDefaultProjects());
    }

    private void givenProjectsToWorkThirdInteraction() {
        this.simulation.selectProjectsToWork();

        SortedSet<Project> projects = this.simulation.projectOptions();
        assertEquals(9, projects.size());
    }

    private void givenProjectsToWorkSecondInteraction() {
        this.simulation.selectProjectsToWork();
        SortedSet<Project> projects = this.simulation.projectOptions();
        assertEquals(6, projects.size());

        assertEquals(3, simulation.numberOfDefaultProjects());
    }

    private void givenProjectsToWorkFirstInteraction() {
        this.simulation.selectProjectsToWork();
        SortedSet<Project> projects = this.simulation.projectOptions();

        assertEquals(3, projects.size());

        assertEquals(6, simulation.numberOfDefaultProjects());
    }
}
