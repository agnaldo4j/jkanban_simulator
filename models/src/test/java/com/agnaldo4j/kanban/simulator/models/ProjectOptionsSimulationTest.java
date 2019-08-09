package com.agnaldo4j.kanban.simulator.models;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProjectOptionsSimulationTest extends DefaultSimulationTest {

    @Test
    public void give_project_options_to_work() {
        assertEquals(9, simulation.numberOfDefaultProjects());

        givenProjectsToWorkFirstInteraction();
        givenProjectsToWorkSecondInteraction();
        givenProjectsToWorkThirdInteraction();

        assertEquals(0, simulation.numberOfDefaultProjects());
    }

    private void givenProjectsToWorkThirdInteraction() {
        this.simulation.selectProjectsToWork();
        List<Project> projects = this.simulation.projectOptions();
        assertEquals(1, projects.get(0).order());
        assertEquals(2, projects.get(1).order());
        assertEquals(3, projects.get(2).order());
        assertEquals(4, projects.get(3).order());
        assertEquals(5, projects.get(4).order());
        assertEquals(6, projects.get(5).order());
        assertEquals(7, projects.get(6).order());
        assertEquals(8, projects.get(7).order());
        assertEquals(9, projects.get(8).order());
    }

    private void givenProjectsToWorkSecondInteraction() {
        this.simulation.selectProjectsToWork();
        List<Project> projects = this.simulation.projectOptions();

        assertEquals(1, projects.get(0).order());
        assertEquals(2, projects.get(1).order());
        assertEquals(3, projects.get(2).order());
        assertEquals(4, projects.get(3).order());
        assertEquals(5, projects.get(4).order());
        assertEquals(6, projects.get(5).order());

        assertEquals(3, simulation.numberOfDefaultProjects());
    }

    private void givenProjectsToWorkFirstInteraction() {
        this.simulation.selectProjectsToWork();
        List<Project> projects = this.simulation.projectOptions();

        assertEquals(1, projects.get(0).order());
        assertEquals(2, projects.get(1).order());
        assertEquals(3, projects.get(2).order());

        assertEquals(6, simulation.numberOfDefaultProjects());
    }
}
