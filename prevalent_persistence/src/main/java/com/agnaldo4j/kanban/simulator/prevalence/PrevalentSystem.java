package com.agnaldo4j.kanban.simulator.prevalence;

import com.agnaldo4j.kanban.simulator.models.Simulation;

import java.io.IOException;
import java.util.List;

public interface PrevalentSystem {
    public void destroyState() throws IOException;

    public void execute(Command command) throws IOException;

    public <T> T execute(Query<T> query);

    public void load(List<Simulation> initialState) throws IOException, ClassNotFoundException;
}
