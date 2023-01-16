package practice;

public class Counter {

    int end;
    int counter = 0;

    Counter(int end) {
        this.end = end;
    }

    int getCounter() {
        return counter;
    }

    void count() {
        if (counter < end) {
            counter += 1;
        }
    }

    public static void main(String[] args) {
    }

}