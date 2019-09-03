package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.EffortType;
import com.agnaldo4j.kanban.simulator.models.Task;
import com.agnaldo4j.kanban.simulator.models.TaskType;

import java.util.ArrayList;
import java.util.List;

public class EProject extends ProjectBuilder {

    public EProject() {
        super(5, 3000);
    }

    protected List<Task> buildTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(buildTask(TaskType.Bug, EffortType.Easy, EffortType.Medium, EffortType.Easy, 1));
        tasks.add(buildTask(TaskType.Bug, EffortType.Hard, EffortType.Medium, EffortType.Normal, 2));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Hard, EffortType.Easy, 3));
        tasks.add(buildTask(TaskType.Bug, EffortType.Medium, EffortType.VeryHard, EffortType.Normal, 4));
        tasks.add(buildTask(TaskType.Normal, EffortType.Hard, EffortType.Medium, EffortType.Medium, 5));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.Medium, EffortType.VeryHard, 6));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Medium, EffortType.Medium, 7));
        tasks.add(buildTask(TaskType.Bug, EffortType.Hard, EffortType.Easy, EffortType.Normal, 8));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Hard, EffortType.VeryHard, 9));
        tasks.add(buildTask(TaskType.Normal, EffortType.Hard, EffortType.Medium, EffortType.Medium, 10));
        tasks.add(buildTask(TaskType.Bug, EffortType.Easy, EffortType.Normal, EffortType.Medium, 11));
        tasks.add(buildTask(TaskType.Normal, EffortType.Easy, EffortType.Normal, EffortType.Hard, 12));
        tasks.add(buildTask(TaskType.Normal, EffortType.Easy, EffortType.Medium, EffortType.Hard, 13));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.VeryHard, EffortType.Medium, 14));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.VeryHard, EffortType.VeryHard, 15));
        return tasks;
    }
}
