package oving4.merchant;



public class Item {

    private String name;
    private String type;
    private double price;
    private Merchant merchant;

    public Item(String name, String type, double price) {
        if (!validateItem(name, type, price)) {
            throw new IllegalArgumentException("Name cannot be empty, or type is illegal, price cannot be 0");
        }

        
    }

    private boolean validateItem(String name, String type, double price) {
        // validate name, cannot be empty:
        if (name == "") {
            return false;
        }

        if (type != "Weapon" && type != "Armour" && type != "Potion" || type != "Valueable") {
            return false;
        }

        if (price < 0) {
            return false;
        }

        return true;

    }

    public Merchant getOwner() {
        return this.merchant;
    }

    public void changeOwner(Merchant merchant) {
        this.merchant = merchant;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Can't set price to less than 0!");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item [name=" + name + ", type=" + type + ", price=" + price + "]";
    }

    
    
}
