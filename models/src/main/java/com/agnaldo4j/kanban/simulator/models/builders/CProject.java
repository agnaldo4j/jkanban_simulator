package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.EffortType;
import com.agnaldo4j.kanban.simulator.models.Task;
import com.agnaldo4j.kanban.simulator.models.TaskType;

import java.util.ArrayList;
import java.util.List;

public class CProject extends ProjectBuilder {

    public CProject() {
        super(3, 2500);
    }

    protected List<Task> buildTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(buildTask(TaskType.Normal, EffortType.Easy, EffortType.Hard, EffortType.Hard, 1));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.Medium, EffortType.Medium, 2));
        tasks.add(buildTask(TaskType.Bug, EffortType.Easy, EffortType.Medium, EffortType.Easy, 3));
        tasks.add(buildTask(TaskType.Bug, EffortType.Hard, EffortType.Medium, EffortType.Hard, 4));
        tasks.add(buildTask(TaskType.Normal, EffortType.VeryHard, EffortType.Normal, EffortType.Easy, 5));
        tasks.add(buildTask(TaskType.Bug, EffortType.Normal, EffortType.VeryHard, EffortType.Normal, 6));
        tasks.add(buildTask(TaskType.Normal, EffortType.Hard, EffortType.Normal, EffortType.Medium, 7));
        tasks.add(buildTask(TaskType.Normal, EffortType.Hard, EffortType.Medium, EffortType.VeryHard, 8));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Hard, EffortType.Medium,9));
        tasks.add(buildTask(TaskType.Bug, EffortType.Easy, EffortType.Easy, EffortType.Normal, 10));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Hard, EffortType.Hard, 11));
        tasks.add(buildTask(TaskType.Normal, EffortType.Hard, EffortType.Normal, EffortType.Medium, 12));
        tasks.add(buildTask(TaskType.Bug, EffortType.Hard, EffortType.VeryHard, EffortType.Medium, 13));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Easy, EffortType.Hard, 14));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.VeryHard, EffortType.Normal, 15));
        return tasks;
    }
}
