package practice.input;

import java.util.Scanner;
public class Validate {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter your age: ");

        int value = 18;

        int age = scanner.nextInt();


        if (age > value ) {
            System.out.println("You're an adult!");
        
        }else {
            System.out.println("You are underage!");
        }

        } finally {
            scanner.close();
        }
        
        





    }
}
