package com.agnaldo4j.kanban.simulator.prevalence;

import com.agnaldo4j.kanban.simulator.models.Simulation;

import java.io.Serializable;
import java.util.List;

public interface Command extends Serializable {
    public void execute(List<Simulation> state);
}
