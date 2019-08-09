package com.agnaldo4j.kanban.simulator.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;

@Accessors(fluent = true)
public class Simulation extends Domain<Simulation> {

    private static final long serialVersionUID = -5601157972441472469L;
    private static final int PROJECT_SELECTION_BUFFER = 3;

    private final SortedSet<Project> projects;
    private final List<Project> projectOptions;
    private final List<Project> projectCompleted;
    private final List<Member> members;
    private final Kanban kanban;

    @Getter(AccessLevel.PUBLIC)
    public String name;

    public Simulation(Kanban kanban, SortedSet<Project> projects, List<Member> members) {
        this.kanban = kanban;
        this.projects = projects;
        this.members = members;
        this.projectOptions = new ArrayList<>();
        this.projectCompleted = new ArrayList<>();
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

    public void selectProjectsToWork() {
        for(int i = 0; i < PROJECT_SELECTION_BUFFER; i++) {
            Project project = this.projects.first();
            this.projects.remove(project);
            projectOptions.add(project);
        }
    }

    public List<Project> projectOptions() {
        return Collections.unmodifiableList(this.projectOptions);
    }

    public void selectProjectToWork(Project project) {
        this.projectOptions.remove(project);
        this.projects.add(project);
        this.kanban.addTasks(project);
    }
}
