package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.Flow;
import com.agnaldo4j.kanban.simulator.models.Member;
import com.agnaldo4j.kanban.simulator.models.MemberAbility;
import com.agnaldo4j.kanban.simulator.models.Workflow;

import java.util.*;

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
                "Backlog"
        );
    }

    public Flow buildAnalysisWithOrder(int order) {
        List<Member> members = new ArrayList<>();
        members.add(MemberAbility.Analyst.build("Zeca"));

        return new Flow(
                order,
                "Analysis",
                members
        );
    }

    public Flow buildDevelopmentWithOrder(int order) {
        List<Member> members = new ArrayList<>();
        members.add(MemberAbility.Developer.build("Maria"));
        members.add(MemberAbility.Developer.build("Jose"));

        return new Flow(
                order,
                "Development",
                members
        );
    }

    public Flow buildQualityAssuranceWithOrder(int order) {
        List<Member> members = new ArrayList<>();
        members.add(MemberAbility.QualityAssurance.build("Gisele"));

        return new Flow(
                order,
                "Quality Assurance",
                members
        );
    }

    public Flow buildDeployWithOrder(int order) {
        return new Flow(
                order,
                "Deploy"
        );
    }

    public Flow buildDoneWithOrder(int order) {
        return new Flow(
                order,
                "Done"
        );
    }
}
