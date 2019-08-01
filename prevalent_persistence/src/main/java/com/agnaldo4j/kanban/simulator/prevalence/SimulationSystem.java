package com.agnaldo4j.kanban.simulator.prevalence;

import com.agnaldo4j.kanban.simulator.models.Simulation;
import org.springframework.util.FileCopyUtils;

import java.io.*;
import java.util.List;

public class SimulationSystem implements PrevalentSystem {

    private List<Simulation> state;
    private ObjectOutputStream journal;
    private File stateFile;

    public SimulationSystem() {
        this("simulator_system.dat");
    }

    public SimulationSystem(String stateFile) {
        this(new File(stateFile));
    }

    public SimulationSystem(File stateFile) {
        this.stateFile = stateFile;
    }

    public void destroyState() throws IOException {
        journal.flush();
        journal.close();
        this.stateFile.delete();
    }

    public synchronized void execute(Command command) throws IOException {
        writeToJournal(command);
        command.execute(state);
    }

    public <RESULT> RESULT execute(Query<RESULT> query) {
        return query.execute(state);
    }

    public void load(List<Simulation> initialState) throws IOException, ClassNotFoundException {
        state = restoreState(initialState);
        if(this.stateFile.exists()) {
            File backupFile = new File(this.stateFile.getName() + ".bkp");
            if (backupFile.exists()) backupFile.delete();
            FileCopyUtils.copy(this.stateFile, backupFile);
        }
        journal = new ObjectOutputStream(new FileOutputStream(this.stateFile));
        writeToJournal(state);
    }

    private List<Simulation> restoreState(List<Simulation> initialState) throws IOException, ClassNotFoundException {
        if (this.stateFile.exists()) return restoreStateFrom(this.stateFile);
        else return initialState;
    }

    private List<Simulation> restoreStateFrom(File storage) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(storage);
        ObjectInputStream input = new ObjectInputStream(fileInputStream);
        List<Simulation> restoredState = restoreImage(input);
        restoreCommands(restoredState, input);
        input.close();
        fileInputStream.close();
        return restoredState;
    }

    private List<Simulation> restoreImage(ObjectInputStream input) throws IOException, ClassNotFoundException {
        return (List<Simulation>) input.readObject();
    }

    private void restoreCommands(List<Simulation> state, ObjectInputStream input) throws IOException, ClassNotFoundException {
        try {
            while (true) ((Command) input.readObject()).execute(state);
        } catch (EOFException e) { }
    }

    private void writeToJournal(Object object) throws IOException {
        journal.writeObject(object);
        journal.flush();
    }
}
