package oving1;

public class Digit {
    int numSys;
    int siff;

    public Digit(int numSys, int siff) {
        this.numSys = numSys;
        this.siff = 0;
    }

    public int getValue() {
        return siff;
    }

    public int getBase() {
        return numSys;
    }

    public boolean increment() {
        if (siff < numSys) {
            siff++;
            return false;
        } else {
            siff = 0;
            return true;
        }
    }

    public static void main(String[] args) {
        Digit n = new Digit(10, 2);
        System.out.println(n.getValue());
    }
}
