package oving7;

public class PassengerCar extends TrainCar {

    private int passengers;
    private int passengerWeight = 80;

    public PassengerCar(int deadWeight, int passengers) {
        super(deadWeight);
        setPassengerCount(passengers);
    }

    public int getPassengerCount() {
        return this.passengers;
    }

    public void setPassengerCount(int newPassengers) {
        this.passengers = newPassengers;
        if (newPassengers > newPassengers) {
            this.totalWeight -= newPassengers * passengerWeight;

        } else if (newPassengers < newPassengers) {
            this.totalWeight += newPassengers * passengerWeight;
        } else {
            this.totalWeight = (newPassengers * passengerWeight) + this.getDeadWeight();
        }
        
    } 

    

    public int getPassengers() {
        return this.passengers;
    }

    public int getPassengerWeight() {
        return this.passengerWeight;
    }



    @Override
    public String toString() {
        return "{" +
            "type: " + getClass().getName() + "," +
            " totalWeigh: '" + getTotalWeight() +
            "'" + "," + " passengers:'" + getPassengers() + "'" +
            ", passengerWeight='" + getPassengerWeight() + "'" +
            "}";
    }


    public static void main(String[] args) {
        PassengerCar car1 = new PassengerCar(3000, 200);
        System.out.println(car1.getTotalWeight());
        car1.setPassengerCount(100);
        System.out.println(car1.getTotalWeight());
    }

    

    
}
