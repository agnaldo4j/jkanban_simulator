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
        tasks.add(buildTask(TaskType.Bug, EffortType.Hard, EffortType.Medium, EffortType.Medium, 1));
        tasks.add(buildTask(TaskType.Bug, EffortType.Normal, EffortType.Medium, EffortType.Normal, 2));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Hard, EffortType.Medium, 3));
        tasks.add(buildTask(TaskType.Bug, EffortType.Medium, EffortType.VeryHard, EffortType.Normal, 4));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Medium, EffortType.Hard, 5));
        tasks.add(buildTask(TaskType.Bug, EffortType.Hard, EffortType.Hard, EffortType.Normal, 6));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Hard, EffortType.VeryHard, 7));
        tasks.add(buildTask(TaskType.Normal, EffortType.Hard, EffortType.Medium, EffortType.Medium, 8));
        tasks.add(buildTask(TaskType.Bug, EffortType.Hard, EffortType.Normal, EffortType.Medium, 9));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.VeryHard, EffortType.Hard, 10));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.VeryHard, EffortType.VeryHard, 11));
        return tasks;
    }
}
