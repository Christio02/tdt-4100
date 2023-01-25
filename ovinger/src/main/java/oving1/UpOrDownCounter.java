package oving1;

public class UpOrDownCounter {

    private int start; // tilstander
    private int end;
    private int counter;

    public UpOrDownCounter(int start, int end) { // constructor
        this.counter = start;
        this.end = end;

        if (counter == end) {
            throw new IllegalArgumentException("Kan ikke ha lik start og end verdi");
        }
    }

    public int getCounter() {
        return counter;
    }

    public boolean count() {
        if (this.counter + 1 == this.end) { // sjekker om counter == end, må ta med + 1 for å fortsatt counte oppover
            counter++;
            return false;

        }
        if (this.counter - 1 == this.end) {
            counter--;
            return false;

        } else if (this.counter < this.end) { // hvis den er mindre eller større, return true;
            this.counter++;
            return true;

        } else if (this.counter > this.end) {
            this.counter--;
            return true;

        } else {
            return false;
        }

    }

    @Override // gjør om til string
    public String toString() {
        return "Counter: " + " " + counter + " " + "End: " + " " + end;
    }

    public static void main(String[] args) {
        UpOrDownCounter UpOrDown = new UpOrDownCounter(-3, -1);
        System.out.println(UpOrDown);
        UpOrDown.count();
        System.out.println(UpOrDown);
        UpOrDown.count();
        System.out.println(UpOrDown);
        System.out.println(UpOrDown.count());

    }
}