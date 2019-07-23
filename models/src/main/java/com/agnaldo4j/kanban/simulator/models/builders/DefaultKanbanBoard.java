package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.Flow;
import com.agnaldo4j.kanban.simulator.models.Kanban;
import com.agnaldo4j.kanban.simulator.models.Workflow;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.UUID;

public class DefaultKanbanBoard {

    private final Flow backlog = new Flow(1, "Backlog", UUID.randomUUID().toString());
    private final Flow analysis = new Flow(2, "Analysis", UUID.randomUUID().toString());
    private final Flow development = new Flow(3, "Development", UUID.randomUUID().toString());
    private final Flow qualityAssurance = new Flow(4, "Quality Assurance", UUID.randomUUID().toString());
    private final Flow done = new Flow(5, "Done", UUID.randomUUID().toString());

    public Kanban build() {
        SortedSet flows = new TreeSet<Flow>();
        flows.add(backlog);
        flows.add(analysis);
        flows.add(development);
        flows.add(qualityAssurance);
        flows.add(done);
        return new Kanban(new Workflow(flows));
    }
}
