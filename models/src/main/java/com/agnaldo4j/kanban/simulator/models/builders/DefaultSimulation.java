package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.Kanban;
import com.agnaldo4j.kanban.simulator.models.Simulation;

public class DefaultSimulation implements Builder<Simulation> {

    private final Builder<Kanban> builder;

    public DefaultSimulation(Builder<Kanban> builder) {
        this.builder = builder;
    }

    public Simulation build() {
        return new Simulation(builder.build());
    }
}
