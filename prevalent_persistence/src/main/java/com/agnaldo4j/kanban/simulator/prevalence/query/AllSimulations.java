package com.agnaldo4j.kanban.simulator.prevalence.query;

import com.agnaldo4j.kanban.simulator.models.Simulation;
import com.agnaldo4j.kanban.simulator.prevalence.Query;

import java.util.Collections;
import java.util.List;

public class AllSimulations implements Query<List<Simulation>> {
    @Override
    public List<Simulation> execute(List<Simulation> state) {
        return Collections.unmodifiableList(state);
    }
}
