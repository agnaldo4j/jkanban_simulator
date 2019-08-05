package com.agnaldo4j.kanban.simulator.jdbc.mappers;

import com.agnaldo4j.kanban.simulator.models.Simulation;
import com.agnaldo4j.kanban.simulator.models.builders.DefaultKanbanBoard;
import com.agnaldo4j.kanban.simulator.models.builders.DefaultMembers;
import com.agnaldo4j.kanban.simulator.models.builders.DefaultProjects;
import com.agnaldo4j.kanban.simulator.models.builders.DefaultSimulation;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;

public class SimulationRowMapper implements RowMapper<Simulation> {
    @Override
    public Simulation mapRow(ResultSet rs, int rowNum) {
        return new DefaultSimulation(new DefaultKanbanBoard(), new DefaultProjects(), new DefaultMembers()).build();

    }
}
