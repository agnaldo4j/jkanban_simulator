package com.agnaldo4j.kanban.simulator.models;

import java.security.InvalidParameterException;

public class Kanban extends Domain<Kanban> {

    private static final long serialVersionUID = -4443681766733527698L;

    private final Workflow workflow;

    public Kanban(Workflow workflow) {
        this.workflow = workflow;
    }

    public int backlogTasks() {
        return workflow.numberOfTasksInBacklog();
    }

    public int numberOfTasksInFlows() {
        return this.workflow.numberOfTasks();
    }

    public void addTasks(Project project) {
        this.workflow.addTasks(project);
    }

    public void addWorkOnAnalysis(Member member) {
        if (member.hasAbility(MemberAbility.Analyst))
            this.workflow.addWorkerOnAnalysis(member);
        else
            throw new InvalidParameterException(
                    "Member("+member.name()+") doesn't have the required ability: "+MemberAbility.Analyst
            );
    }

    public void addWorkOnDevelopment(Member member) {
        if (member.hasAbility(MemberAbility.Developer))
            this.workflow.addWorkerOnDevelopment(member);
        else
            throw new InvalidParameterException(
                    "Member("+member.name()+") doesn't have the required ability: "+MemberAbility.Developer
            );
    }

    public void addWorkOnQualityAssurance(Member member) {
        if (member.hasAbility(MemberAbility.QualityAssurance))
            this.workflow.addWorkerOnQualityAssurance(member);
        else
            throw new InvalidParameterException(
                    "Member("+member.name()+") doesn't have the required ability: "+MemberAbility.QualityAssurance
            );
    }

    public void addWorkOnDeploy(Member member) {
        if (member.hasAbility(MemberAbility.Deployer))
            this.workflow.addWorkerOnDeploy(member);
        else
            throw new InvalidParameterException(
                    "Member("+member.name()+") doesn't have the required ability: "+MemberAbility.Deployer
            );
    }
}
