package com.agnaldo4j.kanban.simulator;

import com.agnaldo4j.kanban.simulator.usecases.Simulator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloGradleController {

    @GetMapping
    public String helloGradle() {
        return new Simulator().execute().helloGradle();
    }

}
