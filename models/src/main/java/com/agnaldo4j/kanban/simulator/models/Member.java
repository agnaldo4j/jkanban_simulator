package com.agnaldo4j.kanban.simulator.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Accessors(fluent = true)
public class Member extends Domain<Member> {

    private static final long serialVersionUID = 5007493779346123655L;

    private final List<MemberAbility> abilities;
    private Flow flow;

    @Getter(AccessLevel.PUBLIC)
    private final String name;

    public Member(MemberAbility ability, String name) {
        this.abilities = new ArrayList<>();
        this.abilities.add(ability);
        this.name = name;
    }

    public Member(List<MemberAbility> abilities, String name) {
        this.abilities = new ArrayList<>();
        this.abilities.addAll(abilities);
        this.name = name;
    }

    public boolean hasAbility(MemberAbility requiredAbility) {
        return this.abilities
                .stream()
                .filter(memberAbility -> memberAbility.equals(requiredAbility))
                .findFirst().isPresent();
    }

    public void workAt(Flow flow) {
        this.flow = flow;
    }
}
