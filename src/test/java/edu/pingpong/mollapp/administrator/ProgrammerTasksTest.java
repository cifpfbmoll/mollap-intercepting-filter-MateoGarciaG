package edu.pingpong.mollapp.administrator;

import edu.pingpong.mollapp.filters.*;
import edu.pingpong.mollapp.targets.Target;
import edu.pingpong.mollapp.targets.Vehicle;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ProgrammerTasksTest {

    private ProgrammerTasks programmerTasks = null;
    private Authentication authentication = null;
    private Autorization autorization = null;

    @Before
    public void setUp() {

        this.programmerTasks = new ProgrammerTasks(new Vehicle());
        this.authentication = new Authentication();
        this.autorization = new Autorization();
    }

    @Test
    public void getandSetTasksTest() {

        this.programmerTasks.setTask(this.authentication);
        this.programmerTasks.setTask(this.autorization);

        assertEquals(2, this.programmerTasks.getTasks().getTasks().size());
        assertEquals(this.authentication, this.programmerTasks.getTasks().getTasks().get(0));
        assertEquals(this.autorization, this.programmerTasks.getTasks().getTasks().get(1));
    }


}
