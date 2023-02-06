package oving4;

public class Partner {

    private String name;
    private Partner partner;

    public Partner(String name, Partner partner) {
        this.name = name;
        this.partner = partner;

    }

    public String getName() {
        return this.name;
    }

    public Partner getPartner() {
        return this.partner;
    }

    public void setPartner(Partner name) {

        this.partner = name;
    }

    @Override
    public String toString() {
        return "Partner [name=" + name + ", partner=" + partner + "]";
    }

    public static void main(String[] args) {
        Partner p1 = new Partner("Chris", null);
        Partner p2 = new Partner("Frida", null);
        Partner p3 = new Partner("Daniel", null);
        Partner p4 = new Partner("Andrea", null);
        p1.setPartner(p2);
        p3.setPartner(p4);
        System.out.println(p1);
        System.out.println(p3);

    }

}
