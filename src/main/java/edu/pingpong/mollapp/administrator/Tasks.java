package edu.pingpong.mollapp.administrator;

import edu.pingpong.mollapp.targets.Target;

public class Tasks {

    private List<Filter> filters = new ArrayList<Filter>();

    private Target target = null;

    public Tasks() {}

    public List<Filter> getTasks() {
        return this.filters;
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public void addTask(Filter filter) {}

    public void execute(String request) {}


}
