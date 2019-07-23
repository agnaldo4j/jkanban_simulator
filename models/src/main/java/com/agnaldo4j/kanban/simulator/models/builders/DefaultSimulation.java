package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.Simulation;

public class DefaultSimulation {

    public Simulation build() {
        return new Simulation(
                new DefaultKanbanBoard().build()
        );
    }
}
