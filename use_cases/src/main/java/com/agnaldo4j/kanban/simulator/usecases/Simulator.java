package com.agnaldo4j.kanban.simulator.usecases;

import com.agnaldo4j.kanban.simulator.models.Simulation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Simulator {
    Logger logger = LogManager.getLogger(Simulator.class);

    public Simulation execute() {
        logger.info("TESTE DE LOG");
        return new Simulation();
    }
}
