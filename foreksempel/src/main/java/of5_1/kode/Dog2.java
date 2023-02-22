package of5_1.kode;

public class Dog2 extends AbstractAnimal {

    
    
    
    public Dog2(String name, int age) {
        super(name, age); // calls the AbstractAnimal abstract class and uses that constructor
    }

    @Override
    public String makeSound() {
        String sound = "Voff!";
        System.out.println(this.getName() + " sier " + sound);
        return sound;
    }

    public static void main(String[] args) {
        AbstractAnimal dog = new Dog2("Charlie", 7);

        




    }

    
}
