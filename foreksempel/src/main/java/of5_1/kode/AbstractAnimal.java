package of5_1.kode;

public abstract class AbstractAnimal { // kinda like a interface but has logic

    private String name;
    private int age;

    public AbstractAnimal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    
    public String getName() {
        return this.name;
    }

   
    public int getAge() {
       return this.age;
    }

    public abstract String makeSound(); // same as interface



}
