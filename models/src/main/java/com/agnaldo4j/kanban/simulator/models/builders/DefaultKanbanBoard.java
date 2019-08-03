package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.Kanban;
import com.agnaldo4j.kanban.simulator.models.Member;
import com.agnaldo4j.kanban.simulator.models.Workflow;

import java.util.List;

public class DefaultKanbanBoard implements Builder<Kanban> {

    private final Builder<List<Member>> membersBuilder;

    public DefaultKanbanBoard(Builder<List<Member>> membersBuilder) {
        this.membersBuilder = membersBuilder;
    }

    public Kanban build() {
        return new Kanban(new Workflow(), membersBuilder.build());
    }
}
