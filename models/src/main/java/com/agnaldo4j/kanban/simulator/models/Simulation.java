package com.agnaldo4j.kanban.simulator.models;

import java.util.ArrayList;
import java.util.List;

public class Simulation extends Domain<Simulation> {

    private static final long serialVersionUID = -5601157972441472469L;

    private final List<Project> projects;
    private final List<Project> projectOptions;
    private final List<Member> members;
    private final Kanban kanban;
    public String name;

    public Simulation(Kanban kanban, List<Project> projects, List<Member> members) {
        this.kanban = kanban;
        this.projects = projects;
        this.members = members;
        this.projectOptions = new ArrayList<>();
    }

    public int backlogTasks() {
        return this.kanban.backlogTasks();
    }

    public String helloGradle() {
        return "Hello Gradle!";
    }

    public int numberOfTasksOnKanbanBoard() {
        return this.kanban.numberOfTasksInFlows();
    }

    public int numberOfDefaultProjects() {
        return projects.size();
    }

    public int numberOfMembers() {
        return this.members.size();
    }

    public long numberOfAnalysts() {
        return countMembersByAbility(MemberAbility.Analyst);
    }

    public long numberOfDevelopers() {
        return countMembersByAbility(MemberAbility.Developer);
    }

    public long numberOfQAs() {
        return countMembersByAbility(MemberAbility.QualityAssurance);
    }

    private long countMembersByAbility(MemberAbility ability) {
        return this.members.
                stream().
                filter(member -> member.hasAbility(ability))
                .count();
    }
}
