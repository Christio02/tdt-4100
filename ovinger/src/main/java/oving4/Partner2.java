package oving4;

public class Partner2 {

    private String name;
    private Partner partner1;

    public Partner2(String name, Partner partner1) {
        this.name = name;

        this.partner1 = partner1;
    
    }

    public String getName2() {
        return this.name;
    }

    public Partner getPartner1() {
        return this.getPartner1();
    }

    public void setPartner(Partner partner) {
        if (this.partner1 == null) {
            this.partner1.setPartner2(this);
        }

        
    }

    
}


