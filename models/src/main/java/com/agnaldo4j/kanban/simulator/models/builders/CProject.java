package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.EffortType;
import com.agnaldo4j.kanban.simulator.models.Project;
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
        tasks.add(buildTask(TaskType.Normal, EffortType.Easy, EffortType.Hard, EffortType.Hard));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.Medium, EffortType.Medium));
        tasks.add(buildTask(TaskType.Bug, EffortType.Easy, EffortType.Medium, EffortType.Easy));
        tasks.add(buildTask(TaskType.Bug, EffortType.Hard, EffortType.Medium, EffortType.Hard));
        tasks.add(buildTask(TaskType.Normal, EffortType.VeryHard, EffortType.Normal, EffortType.Easy));
        tasks.add(buildTask(TaskType.Bug, EffortType.Normal, EffortType.VeryHard, EffortType.Normal));
        tasks.add(buildTask(TaskType.Normal, EffortType.Hard, EffortType.Normal, EffortType.Medium));
        tasks.add(buildTask(TaskType.Normal, EffortType.Hard, EffortType.Medium, EffortType.VeryHard));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Hard, EffortType.Medium));
        tasks.add(buildTask(TaskType.Bug, EffortType.Easy, EffortType.Easy, EffortType.Normal));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Hard, EffortType.Hard));
        tasks.add(buildTask(TaskType.Normal, EffortType.Hard, EffortType.Normal, EffortType.Medium));
        tasks.add(buildTask(TaskType.Bug, EffortType.Hard, EffortType.VeryHard, EffortType.Medium));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Easy, EffortType.Hard));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.VeryHard, EffortType.Normal));
        return tasks;
    }
}
