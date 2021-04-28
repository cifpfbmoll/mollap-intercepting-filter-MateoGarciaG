package edu.pingpong.mollapp.clients;

import edu.pingpong.mollapp.administrator.ProgrammerTasks;

public class Mollapp implements Client{

    private ProgrammerTasks programmerTasks = null;

    @Override
    public void setProgrammerTasks(ProgrammerTasks programmerTasks) {
        this.programmerTasks = programmerTasks;
    }

    @Override
    public void sendRequest(String request) {
        this.programmerTasks.executeTasks(request);
    }

}
