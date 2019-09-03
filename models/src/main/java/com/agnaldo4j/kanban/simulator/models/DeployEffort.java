package com.agnaldo4j.kanban.simulator.models;

public class DeployEffort extends TaskAbilityEffort {

    private static final long serialVersionUID = -7539352185357721960L;

    public DeployEffort(EffortType effortType) {
        super(effortType, MemberAbility.Deployer);
    }
}
