package com.agnaldo4j.kanban.simulator.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
public class Task extends Domain<Task> implements Comparable<Task> {

    private static final long serialVersionUID = 522248684851316210L;

    private final TaskType taskType;
    private final AnalysisEffort analysisEffort;
    private final DevelopmentEffort developmentEffort;
    private final QualityAssurancesEffort qualityAssuranceEffort;

    @Getter(AccessLevel.PUBLIC)
    private int order;

    public Task(TaskType taskType,
                AnalysisEffort analysisEffort,
                DevelopmentEffort developmentEffort,
                QualityAssurancesEffort qualityAssuranceEffort,
                int order) {

        this.taskType = taskType;
        this.analysisEffort = analysisEffort;
        this.developmentEffort = developmentEffort;
        this.qualityAssuranceEffort = qualityAssuranceEffort;

        this.order = order;
    }

    @Override
    public int compareTo(Task task) {
        if (this.order < task.order) return -1;
        else if (this.order > task.order) return 1;
        else return 0;
    }

    public void changeOrder(int newOrder) {
        this.order = newOrder;
    }
}
