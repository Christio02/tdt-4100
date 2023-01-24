package oving1;

import java.util.Scanner;

public class Stopwatch {
    private static Scanner data = new Scanner(System.in);

    private boolean running = false;
    private int ticks;
    private int ticksStarted;

    public void tick(int tick) {
        this.ticks =+ tick;
    }

    public void start() {
        this.running = true;
    }

    public void stop() {
        this.running = false;
    }

    public boolean isStarted() {
        return running; // returns the current state
    }

    public boolean isStopped() {
        return !running;

    }

    public int getTicks() {
        return ticks; // converts long to int and returns total milliseconds
    }

    // public int getTime() {

        
    // }

    public static void main(String[] args) {

        System.out.println("Write something to start the stopwatch: ");

    }

}
