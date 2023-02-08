package oving4;

import java.util.ArrayList;



public class Merchant {

    private ArrayList<Item> inventory = new ArrayList<>(); // Inventory for merchant


    private double money;

    // constructor that sets amount of money of a merchant
    public Merchant(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be less than 0!");
        }
        this.money = money;
    }

    // method that should obtain a specific Item object

    public double getBalance() {
        return this.money;
    }

    public ArrayList<Item> getInventory() {
        return this.inventory;
    }

    public double getMoney() {
        return this.money;
    }

    public void obtainItem(Item item) {
        this.inventory.add(item);
        item.changeOwner(this); // changes the items ownership to THIS merchant

    }

    public void removeItem(Item item) { // need to find out a way to implement this method
        int index = this.inventory.indexOf(item); 
        this.inventory.remove(index); // removes item from inventory
    }

    // this method should change the item owner, by removing it from the merchant that
    // the method is called upon, this.merchant should then increase balance, while
    // the buyer should reduce balance
    // the  Item should change inventory to new merchant. Illegalstate should be 
    //thrown when buyer has insufficient funds, or if seller does not own Item or 
    // if seller tries to sell Item to himself

    public void sellItem(Item item, Merchant buyer) {
        if (!validateTrade(item, buyer)) {
            throw new IllegalStateException("Buyer has insufficient funds, or seller does not own item, or buyer tries to sell to himself!");
        }

        // buyer states

        this.removeItem(item);
        this.money += item.getPrice(); // adds new funds to buyers balance

        // seller states
        buyer.obtainItem(item); // seller obtains item
        buyer.money -= item.getPrice(); // sellers balance is reduced

    }

    private boolean validateTrade(Item item, Merchant seller) {
        if (seller.getMoney() < item.getPrice()) { // if buyer has less money than the item's price
            return false;
        }

        if (!this.getInventory().contains(item)) { // checks if item is not in inventory for THIS merchant
            return false;
        }

        if (this.equals(seller)) { // this Merchant object cannot be equal to seller Merchant object
            return false;
        }

        return true;
    }

    // sale methods

    public void itemSale(double amount, Item item) {
        
        if (amount < 0 || amount > 1) {
            throw new IllegalArgumentException("Sale must be between 0 and 1!");
        }

        if (!this.inventory.contains(item)) {
            throw new IllegalArgumentException("Can't start sale on item the seller does not own!");
        }

        double sale = amount * item.getPrice();
    
        // should get the correct index of item 
        // int index = this.merchant.getInventory().indexOf(item);
 
       double currPrice = item.getPrice(); // gets the item objects price before sale
       item.setPrice(currPrice - sale); // sets the new price
    }


    // this method should make all Items sale in inventory
    public void inventorySale(double amount) {
        for (Item item : inventory) {
            itemSale(amount, item);
        }
    }

    


    @Override
    public String toString() {
        return "{" +
            " inventory='" + getInventory() + "'" +
            ", money='" + getMoney() + "'" +
            "}";
    }


}
