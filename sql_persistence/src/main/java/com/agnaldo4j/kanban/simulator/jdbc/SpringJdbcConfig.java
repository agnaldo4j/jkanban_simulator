package com.agnaldo4j.kanban.simulator.jdbc;

import com.agnaldo4j.kanban.simulator.jdbc.mappers.SimulationRowMapper;
import com.agnaldo4j.kanban.simulator.models.Simulation;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.RowMapperMap;
import org.springframework.data.jdbc.repository.config.ConfigurableRowMapperMap;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
@ComponentScan("com.agnaldo4j.kanban.simulator.jdbc.repositories")
public class SpringJdbcConfig {

    @Bean
    public DataSource getConnection() throws SQLException {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:postgresql://localhost:5432/kanban_development");
        config.setUsername("agnaldo4j");
        config.setPassword("01aa01");
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

        return new HikariDataSource(config);
    }

    @Bean
    public RowMapperMap rowMappers() {
        return new ConfigurableRowMapperMap()
                .register(Simulation.class, new SimulationRowMapper());
    }
}
