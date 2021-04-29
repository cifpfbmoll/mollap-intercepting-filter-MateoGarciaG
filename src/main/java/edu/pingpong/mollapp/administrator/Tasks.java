package edu.pingpong.mollapp.administrator;

import edu.pingpong.mollapp.targets.Target;
import edu.pingpong.mollapp.filters.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Tasks {

    private final List<Filter> filters = new ArrayList<Filter>();

    private Optional<Target> target = Optional.empty();

    public Tasks() {}

    public List<Filter> getTasks() {
        return this.filters;
    }

    public Target getTarget() {
        return this.target.orElse(null);
    }

    public void setTarget(Target target) {
        this.target = Optional.ofNullable(target);
    }

    public void addTask(Filter filter) {
        this.filters.add(filter);
    }

    public void execute(String request) {

        this.filters.forEach(f -> f.execute(request));

        this.target.ifPresent(t -> t.execution(request));
    }


}
