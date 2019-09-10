package com.agnaldo4j.kanban.simulator.usecases;

import com.agnaldo4j.kanban.simulator.usecases.adapters.SimulatorPersistence;
import com.agnaldo4j.kanban.simulator.usecases.views.SimulationView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ListSimulations {

    @Autowired
    private SimulatorPersistence simulatorPersistence;

    public List<SimulationView> execute() throws Exception {
        return simulatorPersistence
                .listSimulations()
                .stream()
                .map(simulation -> new SimulationView())
                .collect(Collectors.toList());
    }
}
