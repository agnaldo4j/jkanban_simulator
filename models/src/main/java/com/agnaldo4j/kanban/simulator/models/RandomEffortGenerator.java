package com.agnaldo4j.kanban.simulator.models;

import java.util.Random;

public class RandomEffortGenerator implements EffortGenerator {

    private final Random randomGenerator;

    public RandomEffortGenerator() {
        this.randomGenerator = new Random();
    }

    @Override
    public int generateEffort() {
        return this.randomGenerator.nextInt(5) + 1;
    }
}
