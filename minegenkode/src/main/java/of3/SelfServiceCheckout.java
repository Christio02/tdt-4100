package of3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class SelfServiceCheckout {

    private static final List<String> DAYS = Arrays.asList("mon", "tue", "wed", "thu", "fri", "sat", "sun");
    private static final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-zA-Z]).{6,10}$";

    private String day;
    private String phoneNumber;
    private boolean adminMode;
    private String password;
    private List<Item> shoppingcart;

    public SelfServiceCheckout(String day, String phoneNumber, String password) {
        this.validateDay(day);
        this.day = day;

        if (!this.validatePhoneNumber(phoneNumber)) {
            throw new IllegalArgumentException("Not a valid phone number");
        }

        this.phoneNumber = phoneNumber;
        if (!isValidPassword(password)) {
            throw new IllegalArgumentException("Invalid password!");
        }
        this.password = password;

        this.adminMode = false;
        this.shoppingcart = new ArrayList<>();
    }

    public void setPhoneNumber(String phoneNumber) {
        if (!this.validatePhoneNumber(phoneNumber)) {
            throw new IllegalArgumentException("Not a valid phone number");
        }

        this.phoneNumber = phoneNumber;

    }

    public void enableAdminMode(String password) {
        if (!this.password.equals(password)) {
            throw new IllegalArgumentException("Wrong password!");
        }

        if (this.adminMode) {
            throw new IllegalStateException("Already in admin mode!");
        }

        this.adminMode = true;
    }

    public void scanItem(Item item) {
        this.shoppingcart.add(item);
        System.out.println(String.format("%-20s %.2f kr", item.getName(), item.getPrice())); // strengen skal være 20  // tegn langt, setter inn
                                                                                            
        // mellomrom om det er ledig plass, // float, vill ha 2 siffer etter komma
    }

    public void scanItems(List<Item> items) {
        for (Item item : items) { // for each, samme som for element in list (python)
            this.scanItem(item);
        }
    }

    public void removeFromCart(int index) {
        if (!this.adminMode) {
            throw new IllegalStateException("Not in admin mode!");
        }

        if (index < 0 || index >= this.shoppingcart.size() - 1) {
            throw new IllegalArgumentException("Invalid index" + index);
        }
        this.shoppingcart.remove(index);
    }





    public boolean isMember() {
        return this.phoneNumber != null;
    }

    // Interne valideringsmetoder

    private boolean validatePhoneNumber(String phoneNumber) {
        String cleanPhoneNumber = phoneNumber.replaceAll("\\s", "");

        if (cleanPhoneNumber.startsWith("0047")) {
            if (!(cleanPhoneNumber.startsWith("00479") || cleanPhoneNumber.startsWith("00474"))) {
                return false;
            }
            if (cleanPhoneNumber.length() != 12) {
                return false;
            }
        } else if (cleanPhoneNumber.startsWith("+47")) {
            if (!(cleanPhoneNumber.startsWith("+479") || cleanPhoneNumber.startsWith("+474"))) {
                return false;
            }
            if (cleanPhoneNumber.length() != 11) {
                return false;
            }
        } else {
            return false;
        }

        String subCleanPhoneNumber = cleanPhoneNumber.substring(cleanPhoneNumber.length() - 8);

        char[] chars = subCleanPhoneNumber.toCharArray();

        for (char c : chars) {
            if (!Character.isDigit(c)) {
                return false;
            }

        }

        return true;
    }

    private void validateDay(String day) {
        if (!DAYS.contains(day)) {
            throw new IllegalArgumentException("Not a valid day");
        }
    }

    // trenger bare å sjekke passordet, og this fungerer ikke her.
    private static boolean isValidPassword(String password) {

        return Objects.requireNonNull(password).matches(PASSWORD_REGEX); // sjekker om passordet matcher passord regex    // pattern
                                                                      

    }

    public static void main(String[] args) {
        SelfServiceCheckout checkout = new SelfServiceCheckout("mon", "+4798769538", "FigmaBal1");
        Item item1 = new Item("Cola", 20.0, "brus", "ABCDEF");
        Item item2 = new Item("Fanta", 19.0, "brus", "AFCDEF");
        Item item3 = new Item("Pepsi", 20.0, "brus", "ABGDEF");
        checkout.scanItems(Arrays.asList(item1, item2, item3));

        System.out.println(checkout.isMember());
       
    }
}
