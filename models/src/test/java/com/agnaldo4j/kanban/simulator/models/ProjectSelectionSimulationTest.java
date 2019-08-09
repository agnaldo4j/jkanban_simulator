package com.agnaldo4j.kanban.simulator.models;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProjectSelectionSimulationTest extends DefaultSimulationTest {

    @Test
    public void selectingFirstProjectToWork() {
        this.simulation.selectProjectsToWork();

        List<Project> projects = this.simulation.projectOptions();

        assertEquals(0, this.simulation.numberOfTasksOnKanbanBoard());

        assertEquals(1, projects.get(0).order());
        assertEquals(2, projects.get(1).order());
        assertEquals(3, projects.get(2).order());

        assertEquals(6, simulation.numberOfDefaultProjects());

        Project project = this.simulation.projectOptions().get(1);
        assertEquals(2, project.order());
        assertEquals(1500d, project.income());

        this.simulation.selectProjectToWork(project);

        assertEquals(2, projects.size());
        assertEquals(1, projects.get(0).order());
        assertEquals(3, projects.get(1).order());

        assertEquals(11, this.simulation.numberOfTasksOnKanbanBoard());
    }
}
