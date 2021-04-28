package edu.pingpong.mollapp.administrator;

import edu.pingpong.mollapp.targets.Vehicle;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TasksTest {

    private Tasks tasks = null;


    @Before
    public void setUp() {
        this.tasks = new Tasks();

    }

    @Test
    public void addTasksTest() {
        this.tasks.addTask(new Authentication());
        this.tasks.addTask(new Authorization());

        assertEquals(2, this.tasks.getTasks().length());

    }

    @Test
    public void setTargetTest() {

        Vehicle vehicleTarget = new Vehicle();

        this.tasks.setTarget(vehicleTarget);

        assertEquals(vehicleTarget , this.tasks.getTarget());
    }

    @Test
    public void getTargetTest() {

        assertNull(this.tasks.getTarget());

        Vehicle vehicleTarget = new Vehicle();

        this.tasks.setTarget(vehicleTarget);

        assertEquals(vehicleTarget , this.tasks.getTarget());
    }

}
