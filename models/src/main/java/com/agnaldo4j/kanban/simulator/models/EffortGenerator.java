package com.agnaldo4j.kanban.simulator.models;

import java.io.Serializable;

public interface EffortGenerator extends Serializable {
    public int generateEffort();
}
