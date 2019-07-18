package com.agnaldo4j.kanban.simulator.jdbc.mappers;

import com.agnaldo4j.kanban.simulator.models.Simulation;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SimulationRowMapper implements RowMapper<Simulation> {
    @Override
    public Simulation mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Simulation();
    }
}
