package oving7;

public class TrainCar {
    protected int totalWeight; // sets totalweight, needs to be protected so that subclasses and classes in same package can access it
    // but not public 
    private int deadWeight; // the weight of an empty Traincar


    public TrainCar(int deadWeight) {
        setDeadWeight(deadWeight);
    }

    public int getTotalWeight() {
        return this.totalWeight;
    }

    public void setDeadWeight(int weight) {
        this.deadWeight = weight;
        this.totalWeight = weight; // also need to set totalweight when setting deadweight
    }

    public int getDeadWeight() {
        return this.deadWeight;
    }

    public static void main(String[] args) {
        TrainCar car1 = new TrainCar(1000);
        System.out.println(car1.getDeadWeight());
        System.out.println(car1.getTotalWeight());

    }




    
}
