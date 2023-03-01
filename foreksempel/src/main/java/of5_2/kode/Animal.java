package of5_2.kode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface Animal extends Comparable<Animal> {
    
    public int getAge();
    public String getName();
    public String makeSound();


    public static void main(String[] args) {
        Animal dog = new Dog(7, "Eirik");

        Animal chicken = new Chicken(4, "Mathea");

        Farm farm1 = new Farm();

        Farm farm2 = new Farm();

        farm1.addAnimal(dog); farm1.addAnimal(chicken); 
        farm2.addAnimal(chicken);
        
        
        ((Chicken)chicken).layEgg();

        List<Animal> animals = new ArrayList<>(List.of(new Dog("Ludo", 12), new Dog("Fido", 0), new Chicken("Peter", 1),
			new Chicken("Albert", 4)));
	
	    Collections.sort(animals, (a1, a2) -> a1.getName().compareTo(a2.getName()));
	
        // for (Animal animal : animals) {
        //     animal.makeSound();
        // }
        Farm farm = new Farm();
        farm.addAnimal(new Dog("Ludo", 12));
        farm.addAnimal(new Dog("Fido", 0));
        farm.addAnimal(new Chicken("Peter", 1));
        farm.addAnimal(new Chicken("Peter", 4));

        

        for (String name : farm.getAnimalNames()) {
            System.out.println(name);
        }

        

    }
}
