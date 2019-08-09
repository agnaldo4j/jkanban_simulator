package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.EffortType;
import com.agnaldo4j.kanban.simulator.models.Task;
import com.agnaldo4j.kanban.simulator.models.TaskType;

import java.util.ArrayList;
import java.util.List;

public class BProject extends ProjectBuilder {

    public BProject() {
        super(2, 1500);
    }

    protected List<Task> buildTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(buildTask(TaskType.Normal, EffortType.Easy, EffortType.Normal, EffortType.Normal, 1));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.Medium, EffortType.Easy, 2));
        tasks.add(buildTask(TaskType.Normal, EffortType.Easy, EffortType.Medium, EffortType.Medium, 3));
        tasks.add(buildTask(TaskType.Bug, EffortType.Medium, EffortType.Medium, EffortType.Hard, 4));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.Normal, EffortType.Easy, 5));
        tasks.add(buildTask(TaskType.Bug, EffortType.Easy, EffortType.Easy, EffortType.Normal, 6));
        tasks.add(buildTask(TaskType.Normal, EffortType.Hard, EffortType.Easy, EffortType.Medium, 7));
        tasks.add(buildTask(TaskType.Normal, EffortType.Hard, EffortType.Hard, EffortType.VeryHard, 8));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.VeryHard, EffortType.Medium, 9));
        tasks.add(buildTask(TaskType.Bug, EffortType.Easy, EffortType.Normal, EffortType.Normal, 10));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Normal, EffortType.Hard, 11));
        return tasks;
    }}
