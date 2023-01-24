package oving1;

import java.util.Scanner;

public class Stopwatch {
    // states
    private boolean running = false; // default state, before we start the stopwatch
    private int ticks; // state for holding each tick state
    private int ticksStarted; // calculating ticks since started
    private int lap;

    public void tick(int tick) { // increments tick
        this.ticks = +tick;
    }

    public void start() { // sets running to true
        this.running = true;
    }

    public void stop() { // sets runnin to false
        this.running = false;
    }

    public boolean isStarted() {
        return running; // returns the current state
    }

    public boolean isStopped() {
        return !running;

    }

    public int getTicks() {
        return ticks; // returns total ticks since life of clock
    }

    public int getTime() {
        if (!isStarted()) {
            return -1;
        } else if (isStarted() && !isStopped()) {
            return ticks;

        } else {
            return ticks;
        }

    }

    public static void main(String[] args) {

        System.out.println("Write something to start the stopwatch: ");

    }

}
