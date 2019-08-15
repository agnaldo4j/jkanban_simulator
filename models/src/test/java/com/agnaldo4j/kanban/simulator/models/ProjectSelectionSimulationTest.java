package com.agnaldo4j.kanban.simulator.models;

import org.junit.jupiter.api.Test;

import java.util.SortedSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProjectSelectionSimulationTest extends DefaultSimulationTest {

    @Test
    public void selectingFirstProjectToWork() {
        this.simulation.selectProjectsToWork();

        SortedSet<Project> projects = this.simulation.projectOptions();

        assertEquals(0, this.simulation.numberOfTasksOnKanbanBoard());

        assertEquals(3, projects.size());
        assertEquals(6, simulation.numberOfDefaultProjects());

        Project project = this.simulation.projectOptions().first();
        assertEquals(1, project.order());
        assertEquals(1500d, project.income());

        this.simulation.selectProjectToWork(project);

        assertEquals(2, projects.size());
        assertEquals(8, this.simulation.numberOfTasksOnKanbanBoard());
    }

    @Test
    public void selectingTwoProjectsToWork() {
        this.simulation.selectProjectsToWork();

        SortedSet<Project> projects = this.simulation.projectOptions();

        assertEquals(0, this.simulation.numberOfTasksOnKanbanBoard());

        Project project = this.simulation.projectOptions().first();
        assertEquals(1, project.order());
        assertEquals(1500d, project.income());

        Project secondProject = this.simulation.projectOptions().last();
        assertEquals(3, secondProject.order());
        assertEquals(2500d, secondProject.income());

        this.simulation.selectProjectToWork(project);
        this.simulation.selectProjectToWork(secondProject);

        assertEquals(1, projects.size());

        assertEquals(23, this.simulation.numberOfTasksOnKanbanBoard());
    }
}
