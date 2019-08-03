package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.*;

import java.util.List;

public abstract class ProjectBuilder implements Builder<Project> {

    private final double income;

    public ProjectBuilder(double income) {
        this.income = income;
    }

    @Override
    public Project build() {
        return new Project(income, buildTasks());
    }

    protected abstract List<Task> buildTasks();

    protected Task buildTask(
            TaskType taskType,
            EffortType analysisEffort,
            EffortType developmentEffort,
            EffortType qualityAssuranceEffort) {

        return new Task(
                taskType,
                new AnalysisEffort(analysisEffort),
                new DevelopmentEffort(developmentEffort),
                new QualityAssurancesEffort(qualityAssuranceEffort)
        );
    }
}
