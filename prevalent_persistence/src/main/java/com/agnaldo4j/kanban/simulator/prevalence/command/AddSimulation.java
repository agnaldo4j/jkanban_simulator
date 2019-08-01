package com.agnaldo4j.kanban.simulator.prevalence.command;

import com.agnaldo4j.kanban.simulator.models.Simulation;
import com.agnaldo4j.kanban.simulator.prevalence.Command;

import java.util.List;

public class AddSimulation implements Command {

    private Simulation simulation;

    public AddSimulation(Simulation simulation) {
        this.simulation = simulation;
    }

    @Override
    public void execute(List<Simulation> state) {
        state.add(this.simulation);
    }
}
