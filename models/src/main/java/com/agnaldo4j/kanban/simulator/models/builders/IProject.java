package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.EffortType;
import com.agnaldo4j.kanban.simulator.models.Task;
import com.agnaldo4j.kanban.simulator.models.TaskType;

import java.util.ArrayList;
import java.util.List;

public class IProject extends ProjectBuilder {

    public IProject() {
        super(2500);
    }

    protected List<Task> buildTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(buildTask(TaskType.Normal, EffortType.Easy, EffortType.Normal, EffortType.Hard));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.Hard, EffortType.Easy));
        tasks.add(buildTask(TaskType.Normal, EffortType.Easy, EffortType.Normal, EffortType.Medium));
        tasks.add(buildTask(TaskType.Bug, EffortType.Medium, EffortType.Medium, EffortType.Hard));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.Normal, EffortType.Easy));
        tasks.add(buildTask(TaskType.Bug, EffortType.Normal, EffortType.Easy, EffortType.Normal));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.Easy, EffortType.Medium));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Medium, EffortType.Normal));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Medium, EffortType.Medium));
        tasks.add(buildTask(TaskType.Bug, EffortType.Easy, EffortType.Normal, EffortType.Hard));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Normal, EffortType.Hard));
        return tasks;
    }
}
