package com.agnaldo4j.kanban.simulator.models;

public class TaskAbilityEffort extends Domain {
    private final EffortType effortType;
    private final MemberAbility requiredAbility;

    private int remainingEffort;

    public TaskAbilityEffort(EffortType effortType, MemberAbility requiredAbility) {
        this.effortType = effortType;
        this.requiredAbility = requiredAbility;
        this.remainingEffort = effortType.effort();
    }

    public int executeEffort(Member member, int execution) {
        if (!member.hasAbility(requiredAbility)) return execution;

        if (this.remainingEffort >= execution) {
            this.remainingEffort = this.remainingEffort - execution;
            return 0;
        } else {
            int remainingExecution = execution - this.remainingEffort;
            this.remainingEffort = 0;
            return remainingExecution;
        }
    }
}
