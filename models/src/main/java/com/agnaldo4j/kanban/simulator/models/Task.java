package com.agnaldo4j.kanban.simulator.models;

public class Task extends Domain<Task> {

    private static final long serialVersionUID = 522248684851316210L;

    private final TaskType taskType;
    private final AnalysisEffort analysisEffort;
    private final DevelopmentEffort developmentEffort;
    private final QualityAssurancesEffort qualityAssuranceEffort;

    public Task(TaskType taskType,
                AnalysisEffort analysisEffort,
                DevelopmentEffort developmentEffort,
                QualityAssurancesEffort qualityAssuranceEffort) {

        this.taskType = taskType;
        this.analysisEffort = analysisEffort;
        this.developmentEffort = developmentEffort;
        this.qualityAssuranceEffort = qualityAssuranceEffort;
    }
}
