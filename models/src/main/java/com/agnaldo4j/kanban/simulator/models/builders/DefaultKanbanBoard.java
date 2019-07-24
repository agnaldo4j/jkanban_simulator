package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.Kanban;
import com.agnaldo4j.kanban.simulator.models.Workflow;

public class DefaultKanbanBoard implements Builder<Kanban> {

    private final Builder<Workflow> builder;

    public DefaultKanbanBoard(Builder<Workflow> builder) {
        this.builder = builder;
    }

    public Kanban build() {
        return new Kanban(builder.build());
    }
}
