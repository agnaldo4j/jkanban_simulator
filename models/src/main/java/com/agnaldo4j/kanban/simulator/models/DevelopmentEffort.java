package com.agnaldo4j.kanban.simulator.models;

public class DevelopmentEffort extends TaskAbilityEffort {
    public DevelopmentEffort(EffortType effortType) {
        super(effortType, MemberAbility.Developer);
    }
}
