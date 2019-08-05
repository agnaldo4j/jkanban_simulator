package com.agnaldo4j.kanban.simulator.models;

public class AnalysisEffort extends TaskAbilityEffort {

    private static final long serialVersionUID = 4022319735926326731L;

    public AnalysisEffort(EffortType effortType) {
        super(effortType, MemberAbility.Analyst);
    }
}
