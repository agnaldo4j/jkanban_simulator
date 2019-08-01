package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.Flow;
import com.agnaldo4j.kanban.simulator.models.MemberAbility;
import com.agnaldo4j.kanban.simulator.models.Workflow;

import java.util.SortedSet;
import java.util.TreeSet;

public class DefaultWorkflowStructure implements Builder<Workflow> {

    public Workflow build() {
        SortedSet<Flow> flows = new TreeSet<>();
        flows.add(new Flow(1, MemberAbility.None, "Backlog"));
        flows.add(new Flow(2, MemberAbility.Analyst, "Analysis"));
        flows.add(new Flow(3, MemberAbility.Developer,"Development"));
        flows.add(new Flow(4, MemberAbility.QualityAssurance,"Quality Assurance"));
        flows.add(new Flow(5, MemberAbility.QualityAssurance,"Deploy"));
        flows.add(new Flow(6, MemberAbility.None, "Done"));
        return new Workflow(flows);
    }
}
