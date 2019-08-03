package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.Project;

import java.util.ArrayList;
import java.util.List;

public class DefaultProjects implements Builder<List<Project>> {

    public DefaultProjects() {}

    @Override
    public List<Project> build() {
        List<Project> projects = new ArrayList<>();
        projects.add(new AProject().build());
        projects.add(new BProject().build());
        projects.add(new CProject().build());
        projects.add(new DProject().build());
        projects.add(new EProject().build());
        projects.add(new FProject().build());
        projects.add(new GProject().build());
        projects.add(new HProject().build());
        projects.add(new IProject().build());
        return projects;
    }
}
