package edu.pingpong.mollapp.administrator;

import java.lang.annotation.Target;

public class Tasks {

    private List<Filter> filters = new ArrayList<Filter>();
    
    private Target target = null;

    public Tasks() {}

    public List<Filter> getFilters() {
        return filters;
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    piblic void addTask(Filter filter) {}





}
