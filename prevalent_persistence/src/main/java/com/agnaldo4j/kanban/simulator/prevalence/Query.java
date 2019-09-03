package com.agnaldo4j.kanban.simulator.prevalence;

import com.agnaldo4j.kanban.simulator.models.Simulation;

import java.util.List;

public interface Query<T> {
    T execute(List<Simulation> state);
}
