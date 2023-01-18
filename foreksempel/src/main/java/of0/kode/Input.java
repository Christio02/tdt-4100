package of0.kode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter a number");
            String number = s.nextLine();
            try {
                int balls = Integer.parseInt(number);
                System.out.println(balls);
                
            } catch (InputMismatchException a) {
                System.out.println("Must be an integer!!!!");
            
            } catch (NumberFormatException e) {
                System.out.println("Cannot be a string!!");
            }

                

        } finally {
            s.close();
        }

    

       
        
    }
}
