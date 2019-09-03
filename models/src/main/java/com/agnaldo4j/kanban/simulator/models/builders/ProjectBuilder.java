package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.AnalysisEffort;
import com.agnaldo4j.kanban.simulator.models.DeployEffort;
import com.agnaldo4j.kanban.simulator.models.DevelopmentEffort;
import com.agnaldo4j.kanban.simulator.models.EffortType;
import com.agnaldo4j.kanban.simulator.models.Project;
import com.agnaldo4j.kanban.simulator.models.QualityAssurancesEffort;
import com.agnaldo4j.kanban.simulator.models.Task;
import com.agnaldo4j.kanban.simulator.models.TaskType;

import java.util.List;

public abstract class ProjectBuilder implements Builder<Project> {

    private final double income;
    private final int order;

    public ProjectBuilder(int order, double income) {
        this.income = income;
        this.order = order;
    }

    @Override
    public Project build() {
        return new Project(order, income, buildTasks());
    }

    protected abstract List<Task> buildTasks();

    protected Task buildTask(
            TaskType taskType,
            EffortType analysisEffort,
            EffortType developmentEffort,
            EffortType qualityAssuranceEffort,
            int order) {

        return new Task(
                taskType,
                new AnalysisEffort(analysisEffort),
                new DevelopmentEffort(developmentEffort),
                new QualityAssurancesEffort(qualityAssuranceEffort),
                new DeployEffort(EffortType.Easy),
                order
        );
    }
}
