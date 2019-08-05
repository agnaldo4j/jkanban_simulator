package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.Kanban;
import com.agnaldo4j.kanban.simulator.models.Workflow;

public class DefaultKanbanBoard implements Builder<Kanban> {

    public Kanban build() {
        return new Kanban(new Workflow());
    }
}
