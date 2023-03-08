package of5_1.kode;

public class Cat implements Animal {

    private String name;
    private int age;


    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
       return this.age;
    }

    @Override
    public String makeSound() {
        String sound = "Meow!";
        System.out.println(this.name + " sier " + sound);
        return sound;
    }

    public void attack() {
        
    }


    @Override
    public String toString() {
        return "Cat [name=" + name + ", age=" + age + "]";
    }


    //This is a code snippet that compares the age of two animals
    @Override
    public int compareTo(Animal o2) { //This is the method that compares the age of two animals
         return this.getAge() - o2.getAge(); //This is the return statement that returns the difference between the ages of the two animals
    }

    
}
