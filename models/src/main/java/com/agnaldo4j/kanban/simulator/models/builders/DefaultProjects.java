package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.Project;

import java.util.ArrayList;
import java.util.List;

public class DefaultProjects implements Builder<List<Project>> {
    @Override
    public List<Project> build() {
        return new ArrayList<>();
    }
}
