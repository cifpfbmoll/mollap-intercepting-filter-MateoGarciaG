package edu.pingpong.mollapp.clients;

import edu.pingpong.mollapp.administrator.ProgrammerTasks;

public interface Client {
    void setProgrammerTasks(ProgrammerTasks programmerTasks);
    public void sendRequest(String request);
}

