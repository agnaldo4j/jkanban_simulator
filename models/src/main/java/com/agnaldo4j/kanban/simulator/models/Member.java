package com.agnaldo4j.kanban.simulator.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Accessors(fluent = true)
public class Member extends Domain<Member> {

    private static final long serialVersionUID = 5007493779346123655L;

    private final List<MemberAbility> abilities;
    private Flow flow;

    @Getter(AccessLevel.PUBLIC)
    private final String name;

    public Member(MemberAbility ability, String name) {
        this.abilities = new ArrayList<>();
        this.abilities.add(ability);
        this.name = name;
    }

    public Member(List<MemberAbility> abilities, String name) {
        this.abilities = new ArrayList<>();
        this.abilities.addAll(abilities);
        this.name = name;
    }

    public boolean hasAbility(MemberAbility requiredAbility) {
        return this.abilities.contains(requiredAbility);
    }

    public void workAt(Flow flow) {
        if (this.hasAbility(flow.requiredMemberAbility())) this.flow = flow;
        else throw new IllegalStateException("This member: "+this.name+" don't have required abilities to work on: "+ flow.name());
    }

    public void executeWork(VirtualWork virtualWork) {
        Optional<Task> mostPriorityTaskOpt = this.flow.mostPriorityTask();

        do {
            if (mostPriorityTaskOpt.isPresent()) {
                Task mostPriorityTask = mostPriorityTaskOpt.get();
                if (this.flow.requiredMemberAbility().equals(MemberAbility.Analyst))
                    mostPriorityTask.executeAnalystWork(virtualWork);
                else if (this.flow.requiredMemberAbility().equals(MemberAbility.Developer))
                    mostPriorityTask.executeDeveloperWork(virtualWork);
                else if (this.flow.requiredMemberAbility().equals(MemberAbility.QualityAssurance))
                    mostPriorityTask.executeQualityAssuranceWork(virtualWork);
                else if (this.flow.requiredMemberAbility().equals(MemberAbility.Deployer))
                    mostPriorityTask.executeDeployerWork(virtualWork);

                mostPriorityTaskOpt = this.flow.nextMostPriorityTask(mostPriorityTask);
            }
        } while(virtualWork.hasEffortYet() && mostPriorityTaskOpt.isPresent());
    }
}
