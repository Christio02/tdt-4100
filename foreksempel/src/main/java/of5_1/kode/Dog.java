package of5_1.kode;

public class Dog implements Animal {

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override // a method that is inherited from interface/class and override 
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
       return this.age;
    }

    @Override
    public String makeSound() {
        String sound = "Voff!";
        System.out.println(this.name + " sier " + sound);
        return sound;
    }

    public void fetch() {

    }


    @Override
    public String toString() {
        return "Dog [name=" + name + ", age=" + age + "]";
    }


    @Override
    public int compareTo(Animal o2) { //This is the method that compares the age of two animals
         return this.getAge() - o2.getAge(); //This is the return statement that returns the difference between the ages of the two animals
    }

    
    
}
