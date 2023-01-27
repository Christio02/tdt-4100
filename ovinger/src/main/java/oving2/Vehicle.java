package oving2;

public class Vehicle {

    private char type;
    private char fuel;
    private String regNr;

    // constructor

    // public Vehicle(char type, char fuel, String regNr) {
    // this.type = type;
    // this.regNr = regNr;
    // this.fuel = fuel;
    // }

    public Vehicle() {
    }

    // validate fuel

    public boolean validateFuel(char fuel) {

        if (!Character.isUpperCase(fuel)) { // checks if fuel is uppercase
            return false;

        } // need to add validation for chartype 'H', 'G' 'E', 'D'
        else if (fuel != 'H' && fuel != 'G' && fuel != 'E' && fuel != 'D') {
            return false;
        }
        return true;

    }

    public void setFuelType(char fuel) {
        if (!validateFuel(fuel)) {
            throw new IllegalArgumentException("Drivstoff må være stor bokstav eller ugyldig bokstav!");
        }
        this.fuel = fuel;
    }

    public char getFuelType() {
        return this.fuel;
    }

    public String getRegistrationNumber() {
        return this.regNr;
    }

    public char getVehicleType() {
        return this.type;
    }

    public static void main(String[] args) {
        Vehicle s = new Vehicle();
        s.setFuelType('H');
        System.out.println(s.getFuelType());

    }

}
