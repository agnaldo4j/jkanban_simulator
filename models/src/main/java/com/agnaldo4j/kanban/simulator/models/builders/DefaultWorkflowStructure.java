package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.Flow;
import com.agnaldo4j.kanban.simulator.models.MemberAbility;
import com.agnaldo4j.kanban.simulator.models.Workflow;

import java.util.SortedSet;
import java.util.TreeSet;

public class DefaultWorkflowStructure implements Builder<Workflow> {

    public Workflow build() {
        SortedSet flows = new TreeSet<Flow>();
        flows.add(buildBacklogWithOrder(1));
        flows.add(buildAnalysisWithOrder(2));
        flows.add(buildDevelopmentWithOrder(3));
        flows.add(buildQualityAssuranceWithOrder(4));
        flows.add(buildDeployWithOrder(5));
        flows.add(buildDoneWithOrder(6));
        return new Workflow(flows);
    }

    public Flow buildBacklogWithOrder(int order) {
        return new Flow(
                order,
                MemberAbility.None,
                "Backlog"
        );
    }

    public Flow buildAnalysisWithOrder(int order) {
        return new Flow(
                order,
                MemberAbility.Analyst,
                "Analysis"
        );
    }

    public Flow buildDevelopmentWithOrder(int order) {
        return new Flow(
                order,
                MemberAbility.Developer,
                "Development"
        );
    }

    public Flow buildQualityAssuranceWithOrder(int order) {
        return new Flow(
                order,
                MemberAbility.QualityAssurance,
                "Quality Assurance"
        );
    }

    public Flow buildDeployWithOrder(int order) {
        return new Flow(
                order,
                MemberAbility.QualityAssurance,
                "Deploy"
        );
    }

    public Flow buildDoneWithOrder(int order) {
        return new Flow(
                order,
                MemberAbility.None,
                "Done"
        );
    }
}
