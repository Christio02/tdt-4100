package oving4;

public class PartnerMain {

    public static void main(String[] args) {

        Partner p1 = new Partner("Chris", null);
        Partner2 p2 = new Partner2("Frida", p1);

        
        System.out.println(p2);
        
        
    }
    
}
