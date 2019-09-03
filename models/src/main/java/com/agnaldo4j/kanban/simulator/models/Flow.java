package com.agnaldo4j.kanban.simulator.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.*;
import java.util.stream.Collectors;

@Accessors(fluent = true)
public class Flow extends Domain<Flow> {

    private static final long serialVersionUID = 2054257246011782724L;

    @Getter(AccessLevel.PUBLIC)
    private final MemberAbility requiredMemberAbility;

    @Getter(AccessLevel.PUBLIC)
    private final String name;

    private final SortedSet<Task> tasks;

    public Flow(String name) {
        this(UUID.randomUUID().toString(), name, MemberAbility.None);
    }

    public Flow(String name, MemberAbility requiredMemberAbility) {
        this(UUID.randomUUID().toString(), name, requiredMemberAbility);
    }

    public Flow(String id, String name, MemberAbility requiredMemberAbility) {
        super(id);
        this.name = name;
        this.requiredMemberAbility = requiredMemberAbility;
        this.tasks = new TreeSet<>();
    }

    public SortedSet<Task> tasks() {
        return this.tasks;
    }

    public void addTask(Task task) {
        if(this.tasks.size() > 0) {
            Task lastTask = this.tasks.last();
            task.changeOrder(lastTask.order() + 1);
        }
        this.tasks.add(task);
    }

    public void removeTask(Task task) {
        if (this.tasks.contains(task))
            this.tasks.remove(task);
    }

    public Optional<Task> mostPriorityTask() {
        if (this.tasks.isEmpty()) return Optional.empty();
        else return Optional.of(this.tasks.first());
    }

    public Optional<Task> nextMostPriorityTask(Task fromTask) {
        return this.tasks.stream().filter(task -> task.order() > fromTask.order()).findFirst();
    }

    public List<Task> analysisCompletedTasks() {
        return this.tasks.stream().filter(task -> task.analysisEffortCompleted()).collect(Collectors.toList());
    }

    public List<Task> developmentCompletedTasks() {
        return this.tasks.stream().filter(task -> task.deployEffortCompleted()).collect(Collectors.toList());
    }

    public List<Task> qualityAssuranceCompletedTasks() {
        return this.tasks.stream().filter(task -> task.qualityAssuranceEffortCompleted()).collect(Collectors.toList());
    }

    public List<Task> deployCompletedTasks() {
        return this.tasks.stream().filter(task -> task.deployEffortCompleted()).collect(Collectors.toList());
    }
}
