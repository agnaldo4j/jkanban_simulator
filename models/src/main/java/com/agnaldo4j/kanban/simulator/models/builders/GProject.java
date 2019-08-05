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
        tasks.add(buildTask(TaskType.Bug, EffortType.VeryHard, EffortType.Hard, EffortType.VeryHard));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.Medium, EffortType.Medium));
        tasks.add(buildTask(TaskType.Bug, EffortType.Normal, EffortType.Medium, EffortType.Medium));
        tasks.add(buildTask(TaskType.Normal, EffortType.Hard, EffortType.Medium, EffortType.Easy));
        tasks.add(buildTask(TaskType.Bug, EffortType.VeryHard, EffortType.VeryHard, EffortType.Normal));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.VeryHard, EffortType.Hard));
        tasks.add(buildTask(TaskType.Normal, EffortType.Hard, EffortType.Hard, EffortType.Normal));
        tasks.add(buildTask(TaskType.Normal, EffortType.Hard, EffortType.Normal, EffortType.Hard));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.VeryHard, EffortType.Normal));
        tasks.add(buildTask(TaskType.Bug, EffortType.Hard, EffortType.VeryHard, EffortType.Normal));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Hard, EffortType.Hard));
        tasks.add(buildTask(TaskType.Normal, EffortType.Hard, EffortType.Medium, EffortType.Hard));
        tasks.add(buildTask(TaskType.Bug, EffortType.Hard, EffortType.VeryHard, EffortType.Normal));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Normal, EffortType.Medium));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.Medium, EffortType.Medium));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.VeryHard, EffortType.Normal));
        tasks.add(buildTask(TaskType.Bug, EffortType.Hard, EffortType.VeryHard, EffortType.Hard));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Normal, EffortType.VeryHard));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.Medium, EffortType.Normal));
        tasks.add(buildTask(TaskType.Bug, EffortType.VeryHard, EffortType.VeryHard, EffortType.VeryHard));
        tasks.add(buildTask(TaskType.Bug, EffortType.Hard, EffortType.VeryHard, EffortType.Hard));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Normal, EffortType.Normal));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.Medium, EffortType.Easy));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.Hard, EffortType.Normal));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.Hard, EffortType.Hard));
        return tasks;
    }
}
