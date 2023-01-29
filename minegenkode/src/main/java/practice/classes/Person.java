package practice;

public class Person {
    private String navn; // holder rede på tilstanden til objektet person
    private int alder;

    public Person(String navn, int alder) { // constructor
        this.alder = alder;
        this.navn = navn;
    }

    public int getAlder() {
        return alder;
    }

    public String getNavn() {
        return navn;
    }

    // @Override
    // public String toString() {
    //     return this.navn + "("+this.alder")";
    // }

    public static void main(String[] args) {
        Person p = new Person("Christopher", 20);
        System.out.println(p.getAlder());
    }



}
