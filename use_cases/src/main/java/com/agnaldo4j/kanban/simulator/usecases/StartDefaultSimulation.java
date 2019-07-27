package com.agnaldo4j.kanban.simulator.usecases;

import com.agnaldo4j.kanban.simulator.models.Simulation;
import com.agnaldo4j.kanban.simulator.models.builders.*;
import com.agnaldo4j.kanban.simulator.usecases.adapters.SimulatorPersistence;
import com.agnaldo4j.kanban.simulator.usecases.commands.Command;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartDefaultSimulation {

    @Autowired
    SimulatorPersistence simulatorPersistence;
    public Simulation execute(Command command) throws Exception {
        Simulation simulation = new DefaultSimulation(
                new DefaultKanbanBoard(
                        new DefaultWorkflowStructure(),
                        new DefaultMembers()
                ),
                new DefaultProjects()
        ).build();

        return simulatorPersistence.save(simulation);
    }
}
