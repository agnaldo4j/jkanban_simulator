package com.agnaldo4j.kanban.simulator.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WorkOnTasksSimulationTest extends DefaultSimulationTest {

    @Test()
    public void move_single_task_until_need_some_work() {
        this.simulation.selectProjectsToWork();

        Project project = this.simulation.projectOptions().first();
        this.simulation.selectProjectToWork(project);

        assertEquals(8, this.simulation.numberOfTasksOnKanbanBoard());
        assertEquals(8, this.simulation.tasksInOptions().size());

        this.simulation.moveFromOptionsToBacklog(this.simulation.tasksInOptions().first());

        assertEquals(8, this.simulation.numberOfTasksOnKanbanBoard());
        assertEquals(7, this.simulation.tasksInOptions().size());
        assertEquals(1, this.simulation.tasksInBacklog().size());

        this.simulation.moveFromBacklogToAnalysis(this.simulation.tasksInBacklog().first());

        assertEquals(8, this.simulation.numberOfTasksOnKanbanBoard());
        assertEquals(7, this.simulation.tasksInOptions().size());
        assertEquals(0, this.simulation.tasksInBacklog().size());
        assertEquals(1, this.simulation.tasksInAnalysis().size());

        assertThrows(IllegalStateException.class, () -> {
            this.simulation.moveFromAnalysisToDevelopment(this.simulation.tasksInAnalysis().first());
        });

        assertEquals(8, this.simulation.numberOfTasksOnKanbanBoard());
        assertEquals(7, this.simulation.tasksInOptions().size());
        assertEquals(0, this.simulation.tasksInBacklog().size());
        assertEquals(1, this.simulation.tasksInAnalysis().size());
    }

    @Test()
    public void work_on_single_task_until_done() {
        this.simulation.selectProjectsToWork();

        Project project = this.simulation.projectOptions().first();
        this.simulation.selectProjectToWork(project);

        assertEquals(8, this.simulation.numberOfTasksOnKanbanBoard());
        assertEquals(8, this.simulation.tasksInOptions().size());

        this.simulation.moveFromOptionsToBacklog(this.simulation.tasksInOptions().first());
        this.simulation.moveFromBacklogToAnalysis(this.simulation.tasksInBacklog().first());

        this.simulation.performRandomWork();

        this.simulation.moveFromAnalysisToDevelopment(this.simulation.tasksInAnalysis().first());

        assertEquals(8, this.simulation.numberOfTasksOnKanbanBoard());
        assertEquals(7, this.simulation.tasksInOptions().size());
        assertEquals(0, this.simulation.tasksInBacklog().size());
        //assertEquals(1, this.simulation.tasksInAnalysis().size());
    }
}
