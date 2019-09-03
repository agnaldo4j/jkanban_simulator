package com.agnaldo4j.kanban.simulator.models;

public class ConstantEffortGenerator implements EffortGenerator {
    @Override
    public int generateEffort() {
        return 5;
    }
}
