package practice.innkapsling;

public class Student {

    private String name;
    private int age;

    public void setName(String newName) {
        name = newName;

    }

    public void setAge(int newAge) {
        age = newAge;

    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }



    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}
