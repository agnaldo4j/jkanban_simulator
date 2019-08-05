package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.EffortType;
import com.agnaldo4j.kanban.simulator.models.Task;
import com.agnaldo4j.kanban.simulator.models.TaskType;

import java.util.ArrayList;
import java.util.List;

public class FProject extends ProjectBuilder {

    public FProject() {
        super(6, 1500);
    }

    protected List<Task> buildTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(buildTask(TaskType.Bug, EffortType.Hard, EffortType.Medium, EffortType.Medium));
        tasks.add(buildTask(TaskType.Bug, EffortType.Normal, EffortType.Medium, EffortType.Normal));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Hard, EffortType.Medium));
        tasks.add(buildTask(TaskType.Bug, EffortType.Medium, EffortType.VeryHard, EffortType.Normal));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Medium, EffortType.Hard));
        tasks.add(buildTask(TaskType.Bug, EffortType.Hard, EffortType.Hard, EffortType.Normal));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Hard, EffortType.VeryHard));
        tasks.add(buildTask(TaskType.Normal, EffortType.Hard, EffortType.Medium, EffortType.Medium));
        tasks.add(buildTask(TaskType.Bug, EffortType.Hard, EffortType.Normal, EffortType.Medium));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.VeryHard, EffortType.Hard));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.VeryHard, EffortType.VeryHard));
        return tasks;
    }
}
