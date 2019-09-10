package com.agnaldo4j.kanban.simulator.prevalence.command;

import com.agnaldo4j.kanban.simulator.models.Simulation;
import com.agnaldo4j.kanban.simulator.models.builders.DefaultDays;
import com.agnaldo4j.kanban.simulator.models.builders.DefaultKanbanBoard;
import com.agnaldo4j.kanban.simulator.models.builders.DefaultMembers;
import com.agnaldo4j.kanban.simulator.models.builders.DefaultProjects;
import com.agnaldo4j.kanban.simulator.models.builders.DefaultSimulation;
import com.agnaldo4j.kanban.simulator.prevalence.Command;

import java.util.List;

public class CreateNewSimulation implements Command {

    public CreateNewSimulation() {}

    @Override
    public void execute(List<Simulation> state) {
        Simulation simulation = new DefaultSimulation(
                new DefaultKanbanBoard(),
                new DefaultProjects(),
                new DefaultMembers(),
                new DefaultDays()
        ).build();
        state.add(simulation);
    }
}
