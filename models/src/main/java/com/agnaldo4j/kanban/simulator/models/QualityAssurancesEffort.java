package com.agnaldo4j.kanban.simulator.models;

public class QualityAssurancesEffort extends TaskAbilityEffort {

    private static final long serialVersionUID = -7539352185357721960L;

    public QualityAssurancesEffort(EffortType effortType) {
        super(effortType, MemberAbility.QualityAssurance);
    }
}
