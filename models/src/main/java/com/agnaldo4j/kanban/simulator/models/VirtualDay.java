package com.agnaldo4j.kanban.simulator.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Accessors(fluent = true)
public class VirtualDay extends Domain<VirtualDay> implements Comparable<VirtualDay> {
    private static final long serialVersionUID = 6646626463880156674L;
    private final List<VirtualWork> effortByMember;
    private final EffortGenerator effortGenerator;

    @Getter(AccessLevel.PUBLIC)
    private final int day;

    public VirtualDay(int day) {
        this(day, new RandomEffortGenerator());
    }

    public VirtualDay(int day, EffortGenerator effortGenerator) {
        this.effortGenerator = effortGenerator;
        this.effortByMember = new ArrayList<>();
        this.day = day;
    }

    @Override
    public int compareTo(VirtualDay day) {
        if (this.day < day.day) return -1;
        else if (this.day > day.day) return 1;
        else return 0;
    }

    public void giveEffort(Member member) {
        int randomEffort = this.effortGenerator.generateEffort();
        VirtualWork virtualWork = new VirtualWork(member, "OK", randomEffort);
        this.effortByMember.add(virtualWork);
        member.executeWork(virtualWork);
    }
}
