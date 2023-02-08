package oving4.partner;

public class Partner2 {

    private String name;
    private Partner partner1;

    public Partner2(String name, Partner partner2) {
        this.name = name;
    
    }

    public String getName2() {
        return this.name;
    }

    public Partner getPartner1() {
        if (this.partner1 == null) {
            return null;
        }
        return this.partner1.getPartner2();
    }

    public void setPartner(Partner2 partner) {
        if (this.partner1 == null) {

        }

        
    }

    
}


