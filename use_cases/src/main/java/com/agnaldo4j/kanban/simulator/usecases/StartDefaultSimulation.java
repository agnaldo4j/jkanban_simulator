package com.agnaldo4j.kanban.simulator.usecases;

import com.agnaldo4j.kanban.simulator.usecases.adapters.SimulatorPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartDefaultSimulation {

    @Autowired
    private SimulatorPersistence simulatorPersistence;

    public void execute() throws Exception {
        simulatorPersistence.createNewSimulation();
    }
}
