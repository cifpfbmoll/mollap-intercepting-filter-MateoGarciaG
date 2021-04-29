package edu.pingpong.mollapp.filters;

public class Autorization implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Autorization successfully" + request);
    }
}
