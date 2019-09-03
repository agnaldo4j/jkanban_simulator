package com.agnaldo4j.kanban.simulator.usecases;

import com.agnaldo4j.kanban.simulator.models.Simulation;
import com.agnaldo4j.kanban.simulator.models.builders.DefaultDays;
import com.agnaldo4j.kanban.simulator.models.builders.DefaultKanbanBoard;
import com.agnaldo4j.kanban.simulator.models.builders.DefaultMembers;
import com.agnaldo4j.kanban.simulator.models.builders.DefaultProjects;
import com.agnaldo4j.kanban.simulator.models.builders.DefaultSimulation;
import com.agnaldo4j.kanban.simulator.usecases.adapters.SimulatorPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class StartDefaultSimulation {

    @Autowired
    private SimulatorPersistence simulatorPersistence;

    public Optional<Simulation> execute() throws Exception {
        Simulation simulation = new DefaultSimulation(
                new DefaultKanbanBoard(),
                new DefaultProjects(),
                new DefaultMembers(),
                new DefaultDays()
        ).build();

        simulatorPersistence.add(simulation);

        return Optional.of(simulation);
    }
}
