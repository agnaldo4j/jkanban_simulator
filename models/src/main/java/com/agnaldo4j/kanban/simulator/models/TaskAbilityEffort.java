package com.agnaldo4j.kanban.simulator.models;

public class TaskAbilityEffort extends Domain {

    private static final long serialVersionUID = 1090052594834941806L;

    private final EffortType effortType;
    private final MemberAbility requiredAbility;

    private int remainingEffort;

    public TaskAbilityEffort(EffortType effortType, MemberAbility requiredAbility) {
        this.effortType = effortType;
        this.requiredAbility = requiredAbility;
        this.remainingEffort = effortType.effort();
    }

    public void executeEffort(VirtualWork virtualWork) {
        if (!virtualWork.hasAbility(requiredAbility)) return;

        this.remainingEffort = virtualWork.executeEffort(this.remainingEffort);
    }

    public boolean completed() {
        return this.remainingEffort <= 0;
    }
}
