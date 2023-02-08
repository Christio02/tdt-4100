package oving4.partner;

import java.util.Objects;

public class Partner {

    private String name;
    private Partner2 partner2;

    // contstructor

    public Partner(String name, Partner partner) {
        this.name = Objects.requireNonNull(name);
        this.partner2 = Objects.requireNonNull(partner2);

    }

    public String getName1() {
        return this.name;
    }

    public Partner getPartner2() {
        return partner2.getPartner1();
    }

    public void setPartner2(Partner partner2) {
        if (this.partner2 == null) {

        }

        return;

    }

    @Override
    public String toString() {
        return "Partner1 [name=" + name + ", partner2=" + partner2 + "]";
    }

}
