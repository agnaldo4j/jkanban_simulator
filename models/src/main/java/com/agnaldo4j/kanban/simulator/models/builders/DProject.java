package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.EffortType;
import com.agnaldo4j.kanban.simulator.models.Project;
import com.agnaldo4j.kanban.simulator.models.Task;
import com.agnaldo4j.kanban.simulator.models.TaskType;

import java.util.ArrayList;
import java.util.List;

public class DProject extends ProjectBuilder {

    public DProject() {
        super(4, 3000);
    }

    protected List<Task> buildTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(buildTask(TaskType.Bug, EffortType.Easy, EffortType.Hard, EffortType.VeryHard));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.Medium, EffortType.Hard));
        tasks.add(buildTask(TaskType.Bug, EffortType.Normal, EffortType.Medium, EffortType.Easy));
        tasks.add(buildTask(TaskType.Normal, EffortType.Hard, EffortType.Medium, EffortType.Normal));
        tasks.add(buildTask(TaskType.Bug, EffortType.VeryHard, EffortType.VeryHard, EffortType.Easy));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.VeryHard, EffortType.Normal));
        tasks.add(buildTask(TaskType.Normal, EffortType.Hard, EffortType.Hard, EffortType.Medium));
        tasks.add(buildTask(TaskType.Normal, EffortType.Hard, EffortType.Normal, EffortType.VeryHard));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.VeryHard, EffortType.Medium));
        tasks.add(buildTask(TaskType.Bug, EffortType.Hard, EffortType.Easy, EffortType.Normal));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Hard, EffortType.VeryHard));
        tasks.add(buildTask(TaskType.Normal, EffortType.Hard, EffortType.Medium, EffortType.Medium));
        tasks.add(buildTask(TaskType.Bug, EffortType.Hard, EffortType.Normal, EffortType.Medium));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Normal, EffortType.Hard));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.Medium, EffortType.Hard));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.VeryHard, EffortType.Medium));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.VeryHard, EffortType.VeryHard));
        return tasks;
    }
}
