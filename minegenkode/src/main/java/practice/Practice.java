package practice;

public class Practice {

    public static void main(String[] args) {
    //     String name = "Jeg elsker Java";

    //     System.out.println(addExclamation(name));

    //     Animal a = new Animal();
    //     String dog = Animal.iAmdDog();
    //     System.out.println(dog);

        Animal a = new Animal();
        Animal.doStuff();


    }

    public static String addExclamation(String name) {
        String exl = "!";
        String finalS = name.concat(exl);
        return finalS;

    }



    
}
