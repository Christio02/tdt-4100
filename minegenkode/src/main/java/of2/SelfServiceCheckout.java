package of2;

import java.util.Arrays;
import java.util.List;

public class SelfServiceCheckout {

    public static final List<String> days = Arrays.asList("mon", "tue", "wed", "thu", "fri", "sat", "sun"); // En konstant
    // som ikke kan endres 

                                                                                                           
    private String day;
    private String phoneNumber;

    public SelfServiceCheckout(String day, String phoneNumber) {
        validateDay(day);
        this.day = day;
        if (!validatePhoneNumber(phoneNumber)) {
            throw new IllegalArgumentException("Not a valid phonenumber!");
        }
        this.phoneNumber = phoneNumber;

    }

    private void validateDay(String day) { // private fordi ingen skal ha tilgang til valideringen

        if (!days.contains(day)) {
            throw new IllegalArgumentException("Ugyldig dag!");
        }
    }

    public void setPhoneNumber() {
        if (!validatePhoneNumber(phoneNumber)) {
            throw new IllegalArgumentException("Not a valid phonenumber!");
        }
    }

    private boolean validatePhoneNumber(String phoneNumber) {

        String cleanPhoneNumber = phoneNumber.replaceAll("\\s", "");

        if (cleanPhoneNumber.startsWith("0047")) {
            if (!cleanPhoneNumber.startsWith("00479") || cleanPhoneNumber.startsWith("00474")) {
                return false;
            }

            if (cleanPhoneNumber.length() != 12) { // ikke else if, fordi vi vil at den skal sjekke begge deler
                return false;
            }

        } else if (cleanPhoneNumber.startsWith("+47")) {

            if (!cleanPhoneNumber.startsWith("+00479") || cleanPhoneNumber.startsWith("+00474")) {
                return false;
            }

            if (cleanPhoneNumber.length() != 11) {
                return false;
            }

        } else {
            return false;
        }

        String subCleanPhoneNumber = cleanPhoneNumber.substring(cleanPhoneNumber.length() - 8);

        // en måte sjekke på om alle tallene etter de 3 første er tall
        for (int i = 0; i < subCleanPhoneNumber.length(); i++) {
            char c = subCleanPhoneNumber.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        // eller

        char[] chars = subCleanPhoneNumber.toCharArray();

        for (char c : chars) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }

    public String getDay() {
        return this.day;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public String toString() {
        return "{" +
                " day='" + getDay() + "'" +
                ", phoneNumber='" + getPhoneNumber() + "'" +
                "}";
    }

    public static void main(String[] args) {

        SelfServiceCheckout ph1 = new SelfServiceCheckout("mon", "+4798769538");
        System.out.println(ph1);

    }

}
