package practice;

public class Counter {

    int topp;
    int counter;

    public Counter(int topp) { // definerer kosntruktøren, lager objekt
        this.topp = topp;
        this.counter = 1;
    }

    public boolean count() { // hvis counter er mindre enn topp, øk counter med 1

        if (this.counter < this.topp) {
            this.counter++;
        }

        return this.topp == this.counter;
    }

    public boolean count(int n) {

        if (this.counter + n <= this.topp) { // nå kan vi ikke telle opp mer enn til 3,
            this.counter += n; // ulovlig tilstand, siden man kan sette counter til mer enn topp
        }

        return this.topp == this.counter;
    }

    public int getCounter() { // return tilstanden nå
        return counter;
    }

    public static void main(String[] args) {
        Counter c = new Counter(3); // oppretter counter objekt med topp lik 3
        System.out.println(c.getCounter()); // getCounter returnerer hvor i counter den er nå
        System.out.println(c.count(100)); // fungerer ikke nå lenger, siden det blir en ulovlig tilstand
        System.out.println(c.count(2));
        System.out.println(c.getCounter());
    }

}
