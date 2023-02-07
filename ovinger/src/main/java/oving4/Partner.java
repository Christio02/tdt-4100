package oving4;

public class Partner {

    private String name;
    private Partner partner;

    // contstructor
    public Partner(String name, Partner partner) {
        this.name = name;
        if (partner != null) {
            setPartner(partner);
            partner.setPartner(this);
        }
            
    }

    public String getName() {
        return this.name;
    }

    public Partner getPartner() {
        return this.partner;
    }

    public void setPartner(Partner partner) {
        if (this.partner != partner) {
            this.partner = partner;
            partner.setPartner(this);
        }
            

    }

    @Override
    public String toString() {
        return "Partner [name=" + name + ", partner=" + partner + "]";
    }

    public static void main(String[] args) {
        Partner p1 = new Partner("Chris", null);
        Partner p2 = new Partner("Frida", p1);
        p1.setPartner(p2);

        System.out.println(p1);

    }

}
