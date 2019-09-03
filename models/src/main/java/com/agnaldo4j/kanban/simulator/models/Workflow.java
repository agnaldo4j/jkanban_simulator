package com.agnaldo4j.kanban.simulator.models;

import java.util.Collections;
import java.util.List;
import java.util.SortedSet;

public class Workflow extends Domain<Workflow> {

    private static final long serialVersionUID = 5172780650054081583L;

    private final Flow options;
    private final Flow backlog;
    private final Flow analysis;
    private final Flow development;
    private final Flow qualityAssurance;
    private final Flow deploy;
    private final Flow done;

    public Workflow() {
        this.options = new Flow("Options");
        this.backlog = new Flow("Backlog");
        this.analysis = new Flow("Analysis", MemberAbility.Analyst);
        this.development = new Flow("Development", MemberAbility.Developer);
        this.qualityAssurance = new Flow("Quality Assurance", MemberAbility.QualityAssurance);
        this.deploy = new Flow("Deploy", MemberAbility.Deployer);
        this.done = new Flow("Done");
    }

    public int numberOfTasksInOptions() {
        return this.options.tasks().size();
    }

    public int numberOfTasksInBacklog() {
        return this.backlog.tasks().size();
    }

    public int numberOfTasksInAnalysis() {
        return this.analysis.tasks().size();
    }

    public int numberOfTasksInDevelopment() {
        return this.development.tasks().size();
    }

    public int numberOfTasksInQualityAssurance() {
        return this.qualityAssurance.tasks().size();
    }

    public int numberOfTasksInDeploy() {
        return this.deploy.tasks().size();
    }

    public int numberOfTasksInDone() {
        return this.done.tasks().size();
    }

    public int numberOfTasksInProgress() {
        return this.numberOfTasksInBacklog() +
                this.numberOfTasksInAnalysis() +
                this.numberOfTasksInDevelopment() +
                this.numberOfTasksInQualityAssurance() +
                this.numberOfTasksInDeploy();
    }

    public int numberOfTasks() {
        return this.numberOfTasksInOptions() +
                this.numberOfTasksInBacklog() +
                this.numberOfTasksInAnalysis() +
                this.numberOfTasksInDevelopment() +
                this.numberOfTasksInQualityAssurance() +
                this.numberOfTasksInDeploy() +
                this.numberOfTasksInDone();
    }

    public void addTasks(Project project) {
        project.tasks().forEach(task -> this.options.addTask(task));
    }

    public void addWorkerOnAnalysis(Member worker) {
        worker.workAt(analysis);
    }

    public void addWorkerOnDevelopment(Member worker) {
        worker.workAt(development);
    }

    public void addWorkerOnQualityAssurance(Member worker) {
        worker.workAt(qualityAssurance);
    }

    public void addWorkerOnDeploy(Member worker) {
        worker.workAt(deploy);
    }

    public SortedSet<Task> tasksInOptions() {
        return Collections.unmodifiableSortedSet(this.options.tasks());
    }

    public SortedSet<Task> tasksInBacklog() {
        return Collections.unmodifiableSortedSet(this.backlog.tasks());
    }

    public SortedSet<Task> tasksInAnalysis() {
        return Collections.unmodifiableSortedSet(this.analysis.tasks());
    }

    public SortedSet<Task> tasksInDevelopment() {
        return Collections.unmodifiableSortedSet(this.development.tasks());
    }

    public SortedSet<Task> tasksInQualityAssurance() {
        return Collections.unmodifiableSortedSet(this.qualityAssurance.tasks());
    }

    public SortedSet<Task> tasksInDeploy() {
        return Collections.unmodifiableSortedSet(this.deploy.tasks());
    }

    public SortedSet<Task> tasksInDone() {
        return Collections.unmodifiableSortedSet(this.done.tasks());
    }

    public void moveFromOptionsToBacklog(Task task) {
        this.options.removeTask(task);
        this.backlog.addTask(task);
    }

    public void moveFromBacklogToAnalysis(Task task) {
        this.backlog.removeTask(task);
        this.analysis.addTask(task);
    }

    public void moveFromAnalysisToDevelopment(Task task) {
        if(task.analysisEffortCompleted()) {
            this.analysis.removeTask(task);
            this.development.addTask(task);
        } else throw new IllegalStateException("task "+task.id()+" hasn't be completed");
    }

    public void moveCardsToNextStep() {
        List<Task> analysisCompletedTasks = this.analysis.analysisCompletedTasks();
        List<Task> developmentCompletedTasks = this.development.developmentCompletedTasks();
        List<Task> qualityAssuranceCompletedTasks = this.qualityAssurance.qualityAssuranceCompletedTasks();
        List<Task> deployCompletedTasks = this.deploy.deployCompletedTasks();

        moveCardsToNextStep(analysisCompletedTasks, this.analysis, this.development);
        moveCardsToNextStep(developmentCompletedTasks, this.development, this.qualityAssurance);
        moveCardsToNextStep(qualityAssuranceCompletedTasks, this.qualityAssurance, this.deploy);
        moveCardsToNextStep(deployCompletedTasks, this.deploy, this.done);
    }

    private void moveCardsToNextStep(List<Task> tasks, Flow from, Flow to) {
        tasks
            .forEach(task -> {
                from.removeTask(task);
                to.addTask(task);
            });
    }
}