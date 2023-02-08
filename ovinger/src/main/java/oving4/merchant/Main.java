package oving4.merchant;

public class Main {

    public static void main(String[] args) {
       Merchant m1 = new Merchant(100);
       Merchant m2 = new Merchant(200);

       Item wp = new Item("Knife", "Weapon", 500);
       Item poison = new Item("Terminator", "Potion", 200);
       Item boots = new Item("betterBoots", "Armour", 150);

       m1.obtainItem(wp);
       m1.obtainItem(boots);
       m2.obtainItem(poison);
       
       System.out.println(m1);
       m1.itemSale(0.5, wp);
       System.out.println(wp.getPrice());
       

    //    m1.sellItem(wp, m2);

    //    System.out.println(m1);
    //    System.out.println(m2);


    }
    
}
