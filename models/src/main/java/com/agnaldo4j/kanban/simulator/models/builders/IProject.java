package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.Project;

import java.util.ArrayList;

public class IProject implements Builder<Project> {

    @Override
    public Project build() {
        return new Project(2500, new ArrayList<>());
    }
}
