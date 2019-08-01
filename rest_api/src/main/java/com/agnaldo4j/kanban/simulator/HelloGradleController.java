package com.agnaldo4j.kanban.simulator;

import com.agnaldo4j.kanban.simulator.models.Simulation;
import com.agnaldo4j.kanban.simulator.models.builders.*;
import com.agnaldo4j.kanban.simulator.usecases.Simulator;
import com.agnaldo4j.kanban.simulator.usecases.StartDefaultSimulation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController("/")
public class HelloGradleController {

    Logger logger = LogManager.getLogger(HelloGradleController.class);

    @Autowired
    StartDefaultSimulation startDefaultSimulation;

    @GetMapping
    public String helloGradle() throws Exception {
        logger.info("CONTROLLER CHAMADO");
        Optional<Simulation> optionalSimulation = startDefaultSimulation.execute();

        //TODO fix use of Optional
        return optionalSimulation.orElseGet(this::computeStatus).helloGradle();
    }

    public Simulation computeStatus() {
        return new DefaultSimulation(new DefaultKanbanBoard(new DefaultWorkflowStructure(), new DefaultMembers()), new DefaultProjects()).build();

    }

}
