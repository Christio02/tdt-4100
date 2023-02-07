package oving4;

public class PartnerMain {

    public static void main(String[] args) {

        Partner p1 = new Partner("Chris", null);
        Partner2 p2 = new Partner2("Mats", null);

        p2.setPartner(p1);
        // p1.setPartner2(p2);
        
        
    }
    
}
