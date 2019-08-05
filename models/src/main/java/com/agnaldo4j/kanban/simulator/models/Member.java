package com.agnaldo4j.kanban.simulator.models;

import java.util.ArrayList;
import java.util.List;

public class Member extends Domain<Member> {

    private static final long serialVersionUID = 5007493779346123655L;

    private final List<MemberAbility> abilities;
    private final String name;

    public Member(MemberAbility ability, String name) {
        this.abilities = new ArrayList<>();
        this.abilities.add(ability);
        this.name = name;
    }

    public boolean hasAbility(MemberAbility requiredAbility) {
        return this.abilities
                .stream()
                .filter(memberAbility -> memberAbility.equals(requiredAbility))
                .findFirst().isPresent();
    }
}
