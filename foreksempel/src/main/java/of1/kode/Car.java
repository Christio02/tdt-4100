package of1.kode;

public class Car {

    private String brand;
    private String model;
    private int year;
    private int kmDriven;
    private double speed;

    public Car(String brand, String model, int year, int kmDriven) {

        this.brand = brand;
        this.model = model;
        this.year = Math.max(1950, year); // begrenser den nedre verdien
        this.kmDriven = Math.max(0, kmDriven); // begrenser km kjørt
        this.speed = 0.0; // start speed is always 0

    }

    // setters and getters // don't need setters for model, year and brand (doesn't
    // make sense)
    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public int getKmDriven() {
        return this.kmDriven;
    }

    public void setKmDriven(int kmDriven) {
        this.kmDriven = kmDriven;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void accelerate(double acceleration) {

        if (acceleration > 0) {
            this.speed += acceleration;
        }
    }

    public void brake(double brakeAmount) {
        if (brakeAmount > 0) {
            this.speed = Math.max(0, this.getSpeed() - brakeAmount); // sjekker om brake amount gjør at speed blir
                                                                     // mindre 0
        }
    }

    @Override
    public String toString() {
        return "{" +
                " brand='" + getBrand() + "'" +
                ", model='" + getModel() + "'" +
                ", year='" + getYear() + "'" +
                ", kmDriven='" + getKmDriven() + "'" +
                ", speed='" + getSpeed() + "'" +
                "}";
    }

    public static void main(String[] args) {
        Car car1 = new Car("Tesla", "Model Y", 2022, 10000);
        System.out.println(car1);
        car1.accelerate(100);
        System.out.println(car1);
        car1.brake(50);
        System.out.println(car1);
    }

}
