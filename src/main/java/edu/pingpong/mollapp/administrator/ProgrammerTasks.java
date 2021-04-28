package edu.pingpong.mollapp.administrator;

import edu.pingpong.mollapp.targets.Target;

import java.util.logging.Filter;

public class ProgrammerTasks {


    private Tasks tasks = null;

    public ProgrammerTasks(Target target) {

        this.tasks = new Tasks();
        this.tasks.setTarget(target);
    }

    public void setTask(Filter filter) {
        this.tasks.addTask(filter);
    }

    public Tasks getTasks() {
        return this.tasks;
    }

    public void executeTasks(String request) {
        this.tasks.execute(request);
    }



}
