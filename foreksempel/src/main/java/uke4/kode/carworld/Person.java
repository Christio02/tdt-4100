package uke4.kode.carworld;

public class Person {
    
    // states
    private String name;
    private int age;
    private boolean license;


    public Person(String name, int age, boolean license) { // constructor 
        this.name = name;
        this.setAge(age);
        this.license = license;
    }

    public Person(String name) {
        this(name, 42, false);
    }

    public Person() {
        this("Børge");
    }
    

    public void setAge(int age) {
        if (age < 1) {
            throw new IllegalArgumentException("Kan ikke sette alder til negativt tall!!"); // age should not be negative
        }
        this.age = age; // changes the state to new
    }

    public void misteLappen() { 
        this.license = false;
    }

    public void faaLappen() {
        this.license = true;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean getLicense() {
        return this.license;
    }

    
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", license=" + license + "]";
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1);

        p1.faaLappen();
        System.out.println(p1);

        try {
            p1.setAge(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("HEI");


        
    }


}
