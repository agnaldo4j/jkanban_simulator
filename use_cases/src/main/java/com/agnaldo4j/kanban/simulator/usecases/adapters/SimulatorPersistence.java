package com.agnaldo4j.kanban.simulator.usecases.adapters;

import com.agnaldo4j.kanban.simulator.models.Simulation;

import java.util.List;
import java.util.Optional;

public interface SimulatorPersistence {

    public Optional<Simulation> findById(String id);

    public void createNewSimulation() throws Exception;

    public List<Simulation> listSimulations();
}
