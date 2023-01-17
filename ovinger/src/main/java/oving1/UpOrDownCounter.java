package oving1;

public class UpOrDownCounter {

    int start; // tilstander 
    int end;
    int counter;

    public UpOrDownCounter(int start, int end) {
        this.counter = start;
        this.end = end;
    }

    public int getCounter() {
        return counter;
    }

    public boolean count() {
        if (this.counter > this.end) {
            this.counter--;
            return true;    

        } else if (this.counter < this.end) {
            this.counter++;
            return true;

        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        UpOrDownCounter UpOrDown = new UpOrDownCounter(3, 1);
        System.out.println(UpOrDown.getCounter());
        System.out.println(UpOrDown.count());
        System.out.println(UpOrDown.getCounter());
        System.out.println(UpOrDown.count());
        System.out.println(UpOrDown.getCounter());
        System.out.println(UpOrDown.count());
    }
}