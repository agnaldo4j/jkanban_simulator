package com.agnaldo4j.kanban.simulator.prevalence.query;

import com.agnaldo4j.kanban.simulator.models.Simulation;
import com.agnaldo4j.kanban.simulator.prevalence.Query;

import java.util.List;
import java.util.Optional;

public class SimulationById implements Query<Optional<Simulation>> {

    private String id;

    public SimulationById(String id) {
        this.id = id;
    }

    @Override
    public Optional<Simulation> execute(List<Simulation> state) {
        return state.stream().filter(simulation -> simulation.id().equals(id)).findFirst();
    }
}
