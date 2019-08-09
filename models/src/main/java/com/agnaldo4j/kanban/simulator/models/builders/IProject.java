package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.EffortType;
import com.agnaldo4j.kanban.simulator.models.Task;
import com.agnaldo4j.kanban.simulator.models.TaskType;

import java.util.ArrayList;
import java.util.List;

public class IProject extends ProjectBuilder {

    public IProject() {
        super(9,2500);
    }

    protected List<Task> buildTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(buildTask(TaskType.Normal, EffortType.Easy, EffortType.Normal, EffortType.Hard, 1));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.Hard, EffortType.Easy, 2));
        tasks.add(buildTask(TaskType.Normal, EffortType.Easy, EffortType.Normal, EffortType.Medium, 3));
        tasks.add(buildTask(TaskType.Bug, EffortType.Medium, EffortType.Medium, EffortType.Hard, 4));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.Normal, EffortType.Easy, 5));
        tasks.add(buildTask(TaskType.Bug, EffortType.Normal, EffortType.Easy, EffortType.Normal, 6));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.Easy, EffortType.Medium, 7));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Medium, EffortType.Normal, 8));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Medium, EffortType.Medium, 9));
        tasks.add(buildTask(TaskType.Bug, EffortType.Easy, EffortType.Normal, EffortType.Hard, 10));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Normal, EffortType.Hard, 11));
        return tasks;
    }
}
