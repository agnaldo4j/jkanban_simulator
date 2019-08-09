package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.EffortType;
import com.agnaldo4j.kanban.simulator.models.Project;
import com.agnaldo4j.kanban.simulator.models.Task;
import com.agnaldo4j.kanban.simulator.models.TaskType;

import java.util.ArrayList;
import java.util.List;

public class GProject extends ProjectBuilder {

    public GProject() {
        super(7, 4500);
    }

    protected List<Task> buildTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(buildTask(TaskType.Bug, EffortType.VeryHard, EffortType.Hard, EffortType.VeryHard, 1));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.Medium, EffortType.Medium, 2));
        tasks.add(buildTask(TaskType.Bug, EffortType.Normal, EffortType.Medium, EffortType.Medium, 3));
        tasks.add(buildTask(TaskType.Normal, EffortType.Hard, EffortType.Medium, EffortType.Easy, 4));
        tasks.add(buildTask(TaskType.Bug, EffortType.VeryHard, EffortType.VeryHard, EffortType.Normal, 5));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.VeryHard, EffortType.Hard, 6));
        tasks.add(buildTask(TaskType.Normal, EffortType.Hard, EffortType.Hard, EffortType.Normal, 7));
        tasks.add(buildTask(TaskType.Normal, EffortType.Hard, EffortType.Normal, EffortType.Hard, 8));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.VeryHard, EffortType.Normal, 9));
        tasks.add(buildTask(TaskType.Bug, EffortType.Hard, EffortType.VeryHard, EffortType.Normal, 10));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Hard, EffortType.Hard, 11));
        tasks.add(buildTask(TaskType.Normal, EffortType.Hard, EffortType.Medium, EffortType.Hard, 12));
        tasks.add(buildTask(TaskType.Bug, EffortType.Hard, EffortType.VeryHard, EffortType.Normal, 13));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Normal, EffortType.Medium, 14));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.Medium, EffortType.Medium, 15));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.VeryHard, EffortType.Normal, 16));
        tasks.add(buildTask(TaskType.Bug, EffortType.Hard, EffortType.VeryHard, EffortType.Hard, 17));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Normal, EffortType.VeryHard, 18));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.Medium, EffortType.Normal, 19));
        tasks.add(buildTask(TaskType.Bug, EffortType.VeryHard, EffortType.VeryHard, EffortType.VeryHard, 20));
        tasks.add(buildTask(TaskType.Bug, EffortType.Hard, EffortType.VeryHard, EffortType.Hard, 21));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Normal, EffortType.Normal, 22));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.Medium, EffortType.Easy, 23));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.Hard, EffortType.Normal, 24));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.Hard, EffortType.Hard, 25));
        return tasks;
    }
}
