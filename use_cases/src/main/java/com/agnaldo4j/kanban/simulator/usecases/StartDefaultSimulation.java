package com.agnaldo4j.kanban.simulator.usecases;

import com.agnaldo4j.kanban.simulator.models.Simulation;
import com.agnaldo4j.kanban.simulator.models.builders.*;
import com.agnaldo4j.kanban.simulator.usecases.adapters.SimulatorPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class StartDefaultSimulation {

    @Autowired
    SimulatorPersistence simulatorPersistence;
    public Optional<Simulation> execute() throws Exception {
        Simulation simulation = new DefaultSimulation(
                new DefaultKanbanBoard(),
                new DefaultProjects(),
                new DefaultMembers()
        ).build();

        simulatorPersistence.add(simulation);

        return Optional.of(simulation);
    }
}
