package oving7;

import java.util.ArrayList;
import java.util.List;


public class Train implements Comparable<Train>{
    
    private List<TrainCar> carriages = new ArrayList<>();

    public void addTrainCar(TrainCar carriage) {
        if (!contains(carriage)) {
            this.carriages.add(carriage);

        } else {
            throw new IllegalArgumentException("Can't add same carriage again!");      
        }
       
        
        
    }

    public boolean contains(TrainCar carriage) {
        if(!this.carriages.contains(carriage)) {

            return false;
        }

        return true;
    }

    public int getTotalWeight() {
        return this.carriages.stream() // lambda stream that reduces and sums up totalweight for all carriages
        .reduce(0, (total, trainCar) -> total + trainCar.getTotalWeight(), Integer::sum);
    }


    public int getPassengerCount() { 
        return this.carriages.stream()
        .filter(carriage -> carriage instanceof PassengerCar) // filter on only PassengerCars
        // then does the same, but casts Subclass
        .reduce(0, (total, carriage) -> total + ((PassengerCar)carriage).getPassengerCount(), Integer::sum);
    }

    public int getCargoWeight() {
        return this.carriages.stream()
        .filter(carriage -> carriage instanceof CargoCar)
        .reduce(0, (total, carriage) -> total + ((CargoCar)carriage).getCargoWeight(), Integer::sum);
    }

    public List<TrainCar> getTrain() {
        return this.carriages;
    }


    @Override
    public String toString() {
        String results = "+";
        for (TrainCar trainCar : carriages) {
            results += trainCar.toString();
        }
        return results;
    }

    
    @Override
    public int compareTo(Train anotherTrain) {
        return this.getTrain().size() - anotherTrain.getTrain().size();
    }
    


    public static void main(String[] args) {
        CargoCar cargo = new CargoCar(3000, 2000);
        PassengerCar pass = new PassengerCar(5000, 150);

        Train train1 = new Train(); 

        train1.addTrainCar(cargo);
        train1.addTrainCar(pass);
        System.out.println(train1);




    }



}
