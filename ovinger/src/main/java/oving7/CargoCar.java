package oving7;

public class CargoCar extends TrainCar {

    private int cargoWeight;

    public CargoCar(int deadWeight, int cargoWeight) {
        super(deadWeight); // kalls super constructor
        setCargoWeight(cargoWeight);
        
        
    }

    public int getCargoWeight() {
        return this.cargoWeight;
    }

    public void setCargoWeight(int newWeight) {
       this.cargoWeight = newWeight;
       this.totalWeight = getDeadWeight() + getCargoWeight(); // sets totalWeight of this subclass (cargoCar) to new weight

    }


    @Override
    public String toString() {
        return "{" +
            "type: " + getClass().getName() + "," + " totalweight:'" +
            getTotalWeight() + "'" + "," +
            " cargoWeight:'" + getCargoWeight() + "'" +
            "}";
    }


    public static void main(String[] args) {
        CargoCar car1 = new CargoCar(3000, 2000);

        car1.setCargoWeight(4000);
        System.out.println(car1.getTotalWeight());
    }




    

    
}
