package com.agnaldo4j.kanban.simulator.models;

public class Member extends Domain<Member> {

    private final MemberAbility ability;
    private final String name;

    public Member(MemberAbility ability, String name) {
        this.ability = ability;
        this.name = name;
    }

    public boolean hasAbility(MemberAbility requiredAbility) {
        return this.ability.equals(requiredAbility);
    }
}
