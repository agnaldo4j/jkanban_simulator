package com.agnaldo4j.kanban.simulator.models;

import com.agnaldo4j.kanban.simulator.models.commands.Event;
import io.reactivex.Observer;

public enum MemberAbility {
    None,
    Analyst,
    Developer,
    QualityAssurance;

    public Member build(String name, Observer<Event<Member>> observer) {
        return new Member(this, name, observer);
    }
}
