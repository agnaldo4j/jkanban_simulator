package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.Project;

import java.util.ArrayList;

public class HProject implements Builder<Project> {

    @Override
    public Project build() {
        return new Project(2000, new ArrayList<>());
    }
}
