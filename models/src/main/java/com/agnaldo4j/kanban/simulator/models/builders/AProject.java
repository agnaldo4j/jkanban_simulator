package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.EffortType;
import com.agnaldo4j.kanban.simulator.models.Task;
import com.agnaldo4j.kanban.simulator.models.TaskType;

import java.util.ArrayList;
import java.util.List;

public class AProject extends ProjectBuilder {

    public AProject() {
        super(1, 1500);
    }

    protected List<Task> buildTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(buildTask(TaskType.Normal, EffortType.Easy, EffortType.Normal, EffortType.Normal, 1));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Medium, EffortType.Hard, 2));
        tasks.add(buildTask(TaskType.Bug, EffortType.Easy, EffortType.Medium, EffortType.Medium, 3));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.Medium, EffortType.Normal, 4));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Normal, EffortType.Easy, 5));
        tasks.add(buildTask(TaskType.Bug, EffortType.Normal, EffortType.Easy, EffortType.Normal, 6));
        tasks.add(buildTask(TaskType.Normal, EffortType.Hard, EffortType.Easy, EffortType.Medium, 7));
        tasks.add(buildTask(TaskType.Normal, EffortType.Hard, EffortType.Hard, EffortType.VeryHard, 8));
        return tasks;
    }
}
