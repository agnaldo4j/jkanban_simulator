package com.agnaldo4j.kanban.simulator.models;

public enum EffortType {
    Easy(2),
    Normal(3),
    Medium(4),
    Complex(5),
    Hard(6),
    VeryHard(7);

    private final int effort;

    private EffortType(int effort) {
        this.effort = effort;
    }

    public int effort() {
        return this.effort;
    }
}
