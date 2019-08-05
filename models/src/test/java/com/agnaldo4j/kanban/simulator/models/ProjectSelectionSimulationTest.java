package com.agnaldo4j.kanban.simulator.models;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProjectSelectionSimulationTest extends DefaultSimulationTest {

    @Test
    public void select_project_to_work() {
        assertEquals(9, simulation.numberOfDefaultProjects());

        this.simulation.selectProjectsToWork();
        List<Project> projectsFirst = this.simulation.projectOptions();

        assertEquals(1, projectsFirst.get(0).order());
        assertEquals(2, projectsFirst.get(1).order());
        assertEquals(3, projectsFirst.get(2).order());

        assertEquals(6, simulation.numberOfDefaultProjects());

        this.simulation.selectProjectsToWork();
        List<Project> projectsSecond = this.simulation.projectOptions();

        assertEquals(1, projectsFirst.get(0).order());
        assertEquals(2, projectsFirst.get(1).order());
        assertEquals(3, projectsFirst.get(2).order());
        assertEquals(4, projectsSecond.get(3).order());
        assertEquals(5, projectsSecond.get(4).order());
        assertEquals(6, projectsSecond.get(5).order());

        assertEquals(3, simulation.numberOfDefaultProjects());

        this.simulation.selectProjectsToWork();
        List<Project> projectsThird = this.simulation.projectOptions();
        assertEquals(1, projectsFirst.get(0).order());
        assertEquals(2, projectsFirst.get(1).order());
        assertEquals(3, projectsFirst.get(2).order());
        assertEquals(4, projectsSecond.get(3).order());
        assertEquals(5, projectsSecond.get(4).order());
        assertEquals(6, projectsSecond.get(5).order());
        assertEquals(7, projectsThird.get(6).order());
        assertEquals(8, projectsThird.get(7).order());
        assertEquals(9, projectsThird.get(8).order());

        assertEquals(0, simulation.numberOfDefaultProjects());
    }
}
