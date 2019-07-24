package com.agnaldo4j.kanban.simulator.models;

import com.agnaldo4j.kanban.simulator.models.builders.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuildSimulationTest  {

    @Test
    public void we_can_buy_a_ticket_from_wroclaw_to_berlin_for_ten_euros(){
        Simulation simulation = new DefaultSimulation(new DefaultKanbanBoard(new DefaultWorkflowStructure(), new DefaultMembers()), new DefaultProjects()).build();
        
        assertEquals(2, simulation.backlogTasks().size());
    }
}
