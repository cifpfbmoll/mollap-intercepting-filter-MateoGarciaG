package edu.pingpong.mollapp.clients;

import edu.pingpong.mollapp.administrator.ProgrammerTasks;

public class Client {

    private ProgrammerTasks programmerTasks = null;

    public void setProgrammerTasks(ProgrammerTasks programmerTasks) {
        this.programmerTasks = programmerTasks;
    }

    public void sendRequest(String request) {
        this.programmerTasks.executeTasks(request);
    }

}
