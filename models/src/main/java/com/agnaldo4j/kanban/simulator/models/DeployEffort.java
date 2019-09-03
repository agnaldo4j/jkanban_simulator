package com.agnaldo4j.kanban.simulator.models;

public class DeployEffort extends TaskAbilityEffort {

    private static final long serialVersionUID = -1333117483364273218L;

    public DeployEffort(EffortType effortType) {
        super(effortType, MemberAbility.Deployer);
    }
}
