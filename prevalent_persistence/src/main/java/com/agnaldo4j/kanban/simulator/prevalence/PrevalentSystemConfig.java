package com.agnaldo4j.kanban.simulator.prevalence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.util.ArrayList;

@Configuration
public class PrevalentSystemConfig {
    @Bean
    public PrevalentSystem prevalentSystem() throws IOException, ClassNotFoundException {
        PrevalentSystem prevalentSystem = new SimulationSystem();
        prevalentSystem.load(new ArrayList<>());
        return prevalentSystem;
    }
}
