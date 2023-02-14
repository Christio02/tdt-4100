package oving4;

public class Partner {

    private String name;
    private Partner partner;

    public Partner(String name) {

    }

    public String getName() {
        return name;
    }
    public Partner getPartner() {
        return partner;
    }

    public void setPartner(Partner person) {
        Partner old = this.getPartner();

        if (this.partner == person) {

        }
        else {
            if (old == null && person == null){
				throw new IllegalStateException("Cannot divorce this person, since its not in a relationship!");
			}

			if (old == null){
				this.partner = person;
				person.setPartner(this);
			}
			else if (this.partner == person){
				
			}
			else if (person == null){
				this.partner = null;
				old.setPartner(null);
			}
			else {
				old.setPartner(null);
				setPartner(null);
				setPartner(person);
        }
    }

    
    }
}
