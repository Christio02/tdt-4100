package oving6.delegation.office;

import java.util.function.BinaryOperator;

public interface Employee {
    
    // calculates result by doing operation with values
    public double doCalculations(BinaryOperator<Double> operation, double value1, double value2);

    // prints document
    public void printDocument(String document);

    // returns how many tasks (calulations and printings) that have been done by this object
    public int getTaskCount();

    // amount of employees available including employee object the method is called on, should count for
    // all employee object down in hierarchy
    public int getResourceCount();
    
    



}
