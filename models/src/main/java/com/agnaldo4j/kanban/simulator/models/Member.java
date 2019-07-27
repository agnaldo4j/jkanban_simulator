package com.agnaldo4j.kanban.simulator.models;

import com.agnaldo4j.kanban.simulator.models.commands.Event;
import io.reactivex.Observer;

public class Member extends Domain<Member> {

    private final MemberAbility ability;
    private final String name;

    public Member(MemberAbility ability, String name, Observer<Event<Member>> observer) {
        super(observer);
        this.ability = ability;
        this.name = name;
    }
}
