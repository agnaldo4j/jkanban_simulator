package com.agnaldo4j.kanban.simulator;

import com.agnaldo4j.kanban.simulator.jdbc.SpringJdbcConfig;
import com.agnaldo4j.kanban.simulator.models.Simulation;
import com.agnaldo4j.kanban.simulator.models.builders.DefaultKanbanBoard;
import com.agnaldo4j.kanban.simulator.models.builders.DefaultSimulation;
import com.agnaldo4j.kanban.simulator.models.builders.DefaultWorkflowStructure;
import com.agnaldo4j.kanban.simulator.usecases.adapters.SimulatorPersistence;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Optional;

@Configuration
@ComponentScan("com.agnaldo4j.kanban.simulator.jdbc.repositories")
public class TestSpringJdbcConfig extends SpringJdbcConfig {

    @Bean
    public DataSource dataSource() throws SQLException {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000");
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

        DataSource dataSource = new HikariDataSource(config);
        return dataSource;
    }

    @Bean
    public SimulatorPersistence simulatorPersistence() {
        return new SimulatorPersistence() {
            @Override
            public Optional<Simulation> findById(String id) {
                return Optional.of(new DefaultSimulation(
                        new DefaultKanbanBoard(
                                new DefaultWorkflowStructure()
                        )
                ).build());
            }

            @Override
            public Simulation save(Simulation simulation) throws Exception {
                return new DefaultSimulation(
                        new DefaultKanbanBoard(
                                new DefaultWorkflowStructure()
                        )
                ).build();
            }
        };
    }
}
