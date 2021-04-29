package edu.pingpong.mollapp.filters;

public class Authentication implements Filter {


    @Override
    public void execute(String request) {
        System.out.println("Authenticated successfully" + request);
    }
}
