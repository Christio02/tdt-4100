package oving6.delegation.office;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Clerk implements Employee{

    private Printer printer;
    private int taskCount = 0;
    private List<String> listOfDocuments= new ArrayList<String>();


    public Clerk(Printer printer) {
        this.printer = printer;
    }



    @Override
    public double doCalculations(BinaryOperator<Double> operation, double value1, double value2) {
        taskCount++;
        return operation.apply(value1, value2);
    }

    @Override
    public void printDocument(String document) {
        taskCount++;
        printer.printDocument(document, this); // prints document for this clerk
    }

    @Override
    public int getTaskCount() {
       return this.taskCount;
    }

    @Override
    public int getResourceCount() {
        return 1;
    }
    
}
