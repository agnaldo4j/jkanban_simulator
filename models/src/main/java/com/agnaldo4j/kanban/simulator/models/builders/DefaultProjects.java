package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.Project;

import java.util.SortedSet;
import java.util.TreeSet;

public class DefaultProjects implements Builder<SortedSet<Project>> {

    @Override
    public SortedSet<Project> build() {
        SortedSet<Project> projects = new TreeSet<>();
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
