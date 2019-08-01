package com.agnaldo4j.kanban.simulator.prevalence.adapter;

import com.agnaldo4j.kanban.simulator.models.Simulation;
import com.agnaldo4j.kanban.simulator.prevalence.PrevalentSystem;
import com.agnaldo4j.kanban.simulator.prevalence.command.AddSimulation;
import com.agnaldo4j.kanban.simulator.prevalence.query.SimulationById;
import com.agnaldo4j.kanban.simulator.usecases.adapters.SimulatorPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SimulatorPersistenceAdapter implements SimulatorPersistence {
    @Autowired
    PrevalentSystem prevalentSystem;

    @Override
    public Optional<Simulation> findById(String id) {
        return prevalentSystem.execute(new SimulationById(id));
    }

    @Override
    public void add(Simulation simulation) throws Exception {
        prevalentSystem.execute(new AddSimulation(simulation));
    }
}
