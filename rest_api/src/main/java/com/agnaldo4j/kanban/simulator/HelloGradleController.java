package com.agnaldo4j.kanban.simulator;

import com.agnaldo4j.kanban.simulator.models.Simulation;
import com.agnaldo4j.kanban.simulator.usecases.Simulator;
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
    Simulator simulator;

    @GetMapping
    public String helloGradle() {
        logger.info("CONTROLLER CHAMADO");
        Optional<Simulation> optionalSimulation = simulator.execute();

        if(optionalSimulation.isPresent()) return optionalSimulation.get().helloGradle();
        else return "Not Found";
    }

}
