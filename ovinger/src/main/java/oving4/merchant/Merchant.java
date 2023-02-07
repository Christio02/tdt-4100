package oving4.merchant;

import java.util.ArrayList;

public class Merchant {

    private ArrayList<Item> inventory = new ArrayList<>();
    private double money;

    // constructor that sets amount of money of a merchant
    public Merchant(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be less than 0!");
        }
        this.money = money;
    }

    public void obtainItem(Item item) {
        this.inventory.add(item);

    }

    public void removeItem() {
        this.inventory.remove(0); // removes first item in inventory
    }

    public void sellItem(Item item, Merchant merchant) {
        item.changeOwner(merchant);
        merchant



    }

}
