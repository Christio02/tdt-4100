package uke8.kode;

import java.util.Random;
import java.util.function.Supplier;

public class PersonSupplier implements Supplier<Person>{

    @Override
    public Person get() { // kan lage et nytt person objekt
        Random rand = new Random();
    

        return new Person("Christopher", rand.nextInt(1, 100));
    
    }


    
    public static void main(String[] args) {
        Supplier<Person> supplier = new PersonSupplier(); // lagd et objekt av PersonSupplier fra get
        for (int i = 0; i < 100; i++) { // lager dermed 100 personer med random alder
            System.out.println(supplier.get());
        }
    }
    
}
