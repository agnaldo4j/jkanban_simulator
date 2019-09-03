package com.agnaldo4j.kanban.simulator.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

@Accessors(fluent = true)
public class Simulation extends Domain<Simulation> {

    private static final long serialVersionUID = -5601157972441472469L;
    private static final int PROJECT_SELECTION_BUFFER = 3;

    private final SortedSet<VirtualDay> days;
    private final SortedSet<VirtualDay> pastDays;
    private final SortedSet<Project> projects;
    private final SortedSet<Project> projectOptions;
    private final SortedSet<Project> projectInProgress;
    private final SortedSet<Project> projectCompleted;
    private final List<Member> members;
    private final Kanban kanban;

    @Getter(AccessLevel.PUBLIC)
    public String name;

    public Simulation(Kanban kanban, SortedSet<Project> projects, List<Member> members, SortedSet<VirtualDay> days) {
        this.kanban = kanban;
        this.projects = projects;
        this.members = members;
        this.projectOptions = new TreeSet<>();
        this.projectInProgress = new TreeSet<>();
        this.projectCompleted = new TreeSet<>();
        this.days = days;
        this.pastDays = new TreeSet<>();
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

    public SortedSet<Task> tasksInOptions() {
        return this.kanban.tasksInOptions();
    }

    public SortedSet<Task> tasksInBacklog() {
        return this.kanban.tasksInBacklog();
    }

    public SortedSet<Task> tasksInAnalysis() {
        return this.kanban.tasksInAnalysis();
    }

    public SortedSet<Task> tasksInDevelopment() {
        return this.kanban.tasksInDevelopment();
    }

    public SortedSet<Task> tasksInQualityAssurance() {
        return this.kanban.tasksInQualityAssurance();
    }

    public SortedSet<Task> tasksInDeploy() {
        return this.kanban.tasksInDeploy();
    }

    public SortedSet<Task> tasksInDone() {
        return this.kanban.tasksInDone();
    }

    public void moveFromOptionsToBacklog(Task task) {
        this.kanban.moveFromOptionsToBacklog(task);
    }

    public void moveFromBacklogToAnalysis(Task task) {
        this.kanban.moveFromBacklogToAnalysis(task);
    }

    public void moveFromAnalysisToDevelopment(Task task) {
        this.kanban.moveFromAnalysisToDevelopment(task);
    }

    public void performRandomWork() {
        VirtualDay virtualDay = this.days.first();

        this.members.forEach(member -> virtualDay.giveEffort(member));

        this.days.remove(virtualDay);
        this.pastDays.add(virtualDay);
    }

    public void moveCardsToNextStep() {
        this.kanban.moveCardsToNextStep();
    }
}
