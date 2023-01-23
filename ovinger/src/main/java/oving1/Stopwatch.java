package oving1;

import java.util.Scanner;

public class Stopwatch {
    private static Scanner data = new Scanner(System.in);

    private long start = 0;
    private long stop = 0;
    private boolean isRunning = false;

    public void tick(int ticks) {

    }

    public void start() {
        this.start = System.currentTimeMillis();
        this.isRunning = true;
    }

    public void stop() {
        this.stop = System.currentTimeMillis();
        this.isRunning = false;
    }

    public boolean isStarted() {
        if (isRunning == true) {
            return true;
        }
        return false;
    }

    public boolean isStopped() {
        if (isRunning == false) {
            return true;
        }
        return false;
    }

    public int getTicks() {
        return (int) (stop - start); // converts long to int and returns total milliseconds
    }

    public int getTime() {
        if (isStarted() == false) {
            return -1;
        } else if (isRunning == true && isStopped() == false) {
            return (int) (this.stop - this.start);
        } else {
            return (int) (stop - start);
        }
    }

    public static void main(String[] args) {

        System.out.println("Write something to start the stopwatch: ");

    }

}
