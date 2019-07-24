package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.Member;

import java.util.ArrayList;
import java.util.List;

public class DefaultMembers implements Builder<List<Member>> {
    @Override
    public List<Member> build() {
        return new ArrayList<>();
    }
}
