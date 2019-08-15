package com.agnaldo4j.kanban.simulator.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.*;
import java.util.stream.Collectors;

@Accessors(fluent = true)
public class Simulation extends Domain<Simulation> {

    private static final long serialVersionUID = -5601157972441472469L;
    private static final int PROJECT_SELECTION_BUFFER = 3;

    private final SortedSet<Project> projects;
    private final SortedSet<Project> projectOptions;
    private final SortedSet<Project> projectInProgress;
    private final SortedSet<Project> projectCompleted;
    private final List<Member> members;
    private final Kanban kanban;

    @Getter(AccessLevel.PUBLIC)
    public String name;

    public Simulation(Kanban kanban, SortedSet<Project> projects, List<Member> members) {
        this.kanban = kanban;
        this.projects = projects;
        this.members = members;
        this.projectOptions = new TreeSet<>();
        this.projectInProgress = new TreeSet<>();
        this.projectCompleted = new TreeSet<>();
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

    public List<Member> membersByAbility(MemberAbility ability) {
        return this.members.stream().filter(member -> member.hasAbility(ability)).collect(Collectors.toList());
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

    public SortedSet<Project> projectOptions() {
        return Collections.unmodifiableSortedSet(this.projectOptions);
    }

    public void selectProjectToWork(Project project) {
        this.projectOptions.remove(project);
        if(this.projectInProgress.size() > 0) {
            Project lastProject = this.projectInProgress.last();
            project.changeOrder(lastProject.order() + 1);
            this.projectInProgress.add(project);
        }
        this.kanban.addTasks(project);
    }

    public void addWorkOnAnalysis(Member member) {
        this.kanban.addWorkOnAnalysis(member);
    }

    public void addWorkOnDevelopment(Member member) {
        this.kanban.addWorkOnDevelopment(member);
    }

    public void addWorkOnQualityAssurance(Member member) {
        this.kanban.addWorkOnQualityAssurance(member);
    }
}
