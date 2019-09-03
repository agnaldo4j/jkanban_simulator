package com.agnaldo4j.kanban.simulator.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Accessors(fluent = true)
public class VirtualWork extends Domain<VirtualWork> {
    private static final long serialVersionUID = 6872148889244180382L;

    private List<Task> workedTasks;

    @Getter(AccessLevel.PUBLIC)
    private final Member member;

    @Getter(AccessLevel.PUBLIC)
    private final String message;

    @Getter(AccessLevel.PUBLIC)
    private int effort;

    public VirtualWork(Member member, String message, int effort) {
        this.member = member;
        this.message = message;
        this.effort = effort;
        this.workedTasks = new ArrayList<>();
    }

    public boolean hasAbility(MemberAbility ability) {
        return this.member.hasAbility(ability);
    }

    public boolean hasEffortYet() {
        return this.effort > 0;
    }

    public int executeEffort(int necessaryEffort) {
        int remainingEffort = 0;

        if (necessaryEffort >= this.effort) {
            remainingEffort = necessaryEffort - this.effort;
            this.effort = 0;
        } else this.effort = this.effort - necessaryEffort;

        return remainingEffort;
    }

    public void addWorkedTask(Task task) {
        this.workedTasks.add(task);
    }
}
