package com.agnaldo4j.kanban.simulator.models;

public class DevelopmentEffort extends TaskAbilityEffort {

    private static final long serialVersionUID = 1860053463254401022L;

    public DevelopmentEffort(EffortType effortType) {
        super(effortType, MemberAbility.Developer);
    }
}
