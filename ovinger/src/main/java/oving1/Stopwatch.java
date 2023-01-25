package oving1;

public class StopWatch {
    // states
    private boolean running = false; // default state, before we start the stopwatch
    private int ticks; // state for holding each tick state
    private int lap;

    public StopWatch(Boolean running, int ticks, int lap) {
        this.running = running;
        tick(ticks);
        lap(lap);
        
    }

    public void tick(int tick) { // increments tick
        this.ticks += tick;
    }
    
    public void lap(int lap) {
        this.lap += lap;
    }

    public void start() { // sets running to true
        this.running = true;
    }

    public void stop() { // sets running to false
        this.running = false;
    }

    public boolean isStarted() {
        return running; // returns the current state
    }

    public boolean isStopped() {
        return !running;

    }

    public int getTicks() {
        return this.ticks; // returns total ticks since life of clock
    }

    public int getTime() {
        if (!isStarted()) {
            return -1;

        } else {
            return ticks;
        }
    }

    public int getLapTime() {
        return this.lap;
    }

    public int getLastLapTime() {
        return  1 - this.lap;
    }

}
