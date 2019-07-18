package com.agnaldo4j.kanban.simulator.usecases;

import com.agnaldo4j.kanban.simulator.jdbc.repositories.SimulationRepository;
import com.agnaldo4j.kanban.simulator.models.Simulation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Simulator {
    Logger logger = LogManager.getLogger(Simulator.class);

    @Autowired
    SimulationRepository simulationRepository;

    public Optional<Simulation> execute() {
        logger.info("TESTE DE LOG");
        return simulationRepository.findByEmailAddress("teste");
    }
}
