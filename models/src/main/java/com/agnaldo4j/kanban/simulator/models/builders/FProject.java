package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.Project;

import java.util.ArrayList;

public class FProject implements Builder<Project> {

    @Override
    public Project build() {
        return new Project(1500, new ArrayList<>());
    }
}
