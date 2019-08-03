package com.agnaldo4j.kanban.simulator.models;

public class AnalysisEffort extends TaskAbilityEffort {
    public AnalysisEffort(EffortType effortType) {
        super(effortType, MemberAbility.Analyst);
    }
}
