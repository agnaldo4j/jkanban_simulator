package com.agnaldo4j.kanban.simulator;

import com.agnaldo4j.kanban.simulator.usecases.ListSimulations;
import com.agnaldo4j.kanban.simulator.usecases.StartDefaultSimulation;
import com.agnaldo4j.kanban.simulator.usecases.views.SimulationView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/v1/simulations")
public class SimulationController {

    private final Logger logger = LogManager.getLogger(SimulationController.class);

    @Autowired
    private StartDefaultSimulation startDefaultSimulation;

    @Autowired
    private ListSimulations listSimulations;

    @GetMapping
    public ResponseEntity<String> listSimulations() {
        try {
            List<SimulationView> simulations = listSimulations.execute();
            logger.info(simulations);
            return ResponseEntity.status(HttpStatus.OK).body("{}");
        } catch(Exception e) {
            logger.error(e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("{}");
        }
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> startNewSimulation() {
        logger.info("CONTROLLER CHAMADO");
        try {
            startDefaultSimulation.execute();
            return ResponseEntity.status(HttpStatus.OK).body("{}");
        } catch(Exception e) {
            logger.error(e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("{}");
        }
    }
}
