package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.EffortType;
import com.agnaldo4j.kanban.simulator.models.Project;
import com.agnaldo4j.kanban.simulator.models.Task;
import com.agnaldo4j.kanban.simulator.models.TaskType;

import java.util.ArrayList;
import java.util.List;

public class HProject extends ProjectBuilder {

    public HProject() {
        super(8,2000);
    }

    protected List<Task> buildTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(buildTask(TaskType.Bug, EffortType.VeryHard, EffortType.VeryHard, EffortType.VeryHard, 1));
        tasks.add(buildTask(TaskType.Normal, EffortType.Normal, EffortType.Easy, EffortType.Easy, 2));
        tasks.add(buildTask(TaskType.Bug, EffortType.Normal, EffortType.Medium, EffortType.Hard, 3));
        tasks.add(buildTask(TaskType.Normal, EffortType.Hard, EffortType.Normal, EffortType.Easy, 4));
        tasks.add(buildTask(TaskType.Bug, EffortType.Easy, EffortType.Normal, EffortType.Normal, 5));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Medium, EffortType.Hard, 6));
        tasks.add(buildTask(TaskType.Normal, EffortType.Hard, EffortType.Medium, EffortType.Normal, 7));
        tasks.add(buildTask(TaskType.Normal, EffortType.Hard, EffortType.Normal, EffortType.Easy, 8));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.Hard, EffortType.Normal, 9));
        tasks.add(buildTask(TaskType.Bug, EffortType.Hard, EffortType.VeryHard, EffortType.Normal, 10));
        tasks.add(buildTask(TaskType.Normal, EffortType.Medium, EffortType.VeryHard, EffortType.Hard, 11));
        tasks.add(buildTask(TaskType.Normal, EffortType.VeryHard, EffortType.Medium, EffortType.Hard, 12));
        return tasks;
    }
}
