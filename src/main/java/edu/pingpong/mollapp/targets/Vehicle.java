package edu.pingpong.mollapp.targets;

public class Vehicle implements Target {
    @Override
    public void execution(String request) {
        System.out.println("Open The Door succesfully");
    }

}
