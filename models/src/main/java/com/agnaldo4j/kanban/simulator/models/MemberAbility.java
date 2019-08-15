package com.agnaldo4j.kanban.simulator.models;

public enum MemberAbility {
    None,
    Analyst,
    Developer,
    QualityAssurance,
    Deployer;

    public Member build(String name) {
        return new Member(this, name);
    }
}
