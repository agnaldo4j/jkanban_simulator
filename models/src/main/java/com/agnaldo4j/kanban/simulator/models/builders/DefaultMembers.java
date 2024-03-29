package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.Member;
import com.agnaldo4j.kanban.simulator.models.MemberAbility;

import java.util.ArrayList;
import java.util.List;

public class DefaultMembers implements Builder<List<Member>> {
    @Override
    public List<Member> build() {
        List<Member> members = new ArrayList<>();
        members.add(new Member(MemberAbility.Analyst, "José"));
        members.add(new Member(MemberAbility.Developer, "Carlos"));
        members.add(new Member(MemberAbility.Developer, "Maria"));

        List<MemberAbility> andreiaAbilities = new ArrayList<MemberAbility>();
        andreiaAbilities.add(MemberAbility.QualityAssurance);
        andreiaAbilities.add(MemberAbility.Deployer);
        members.add(new Member(andreiaAbilities, "Andréia"));
        return members;
    }
}
