package com.agnaldo4j.kanban.simulator.jdbc.repositories;

import com.agnaldo4j.kanban.simulator.models.Simulation;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface SimulationRepository extends CrudRepository<Simulation, String> {
    @Query("select firstName, lastName from User u where u.emailAddress = :name")
    public Simulation findByEmailAddress(@Param("name") String name);

    @Modifying
    @Query("UPDATE DUMMYENTITY SET name = :name WHERE id = :id")
    boolean updateName(@Param("id") Long id, @Param("name") String name);
}
