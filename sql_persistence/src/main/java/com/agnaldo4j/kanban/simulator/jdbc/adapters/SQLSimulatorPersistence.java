package com.agnaldo4j.kanban.simulator.jdbc.adapters;

import com.agnaldo4j.kanban.simulator.jdbc.repositories.SimulationRepository;
import com.agnaldo4j.kanban.simulator.models.Simulation;
import com.agnaldo4j.kanban.simulator.usecases.adapters.SimulatorPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class SQLSimulatorPersistence implements SimulatorPersistence {

    @Autowired
    private SimulationRepository simulationRepository;

    @Override
    public Optional<Simulation> findById(String id) {
        return simulationRepository.findByEmailAddress(id);
    }

    @Override
    public void createNewSimulation() throws Exception {
        //simulationRepository.save(simulation);
    }

    @Override
    public List<Simulation> listSimulations() {
        return null;
    }
}
