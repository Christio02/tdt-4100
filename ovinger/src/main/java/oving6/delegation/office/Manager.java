package oving6.delegation.office;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.BinaryOperator;


public class Manager implements Employee {

    private Collection<Employee> listOfEmployees = new ArrayList<>();

    public Manager(Collection<Employee> employees) {
        if (employees.size() == 0) {
            throw new IllegalArgumentException("Cannot invoke when employees Collection is empty!");
        }
        this.listOfEmployees = employees;
    }


    @Override
    public double doCalculations(BinaryOperator<Double> operation, double value1, double value2) {
       for (Employee employee : listOfEmployees) {
            return employee.doCalculations(operation, value1, value2);
       }
       return 0;
    }

    @Override
    public void printDocument(String document) {
       for (Employee employee : listOfEmployees) {
            employee.printDocument(document);
       }
    }

    @Override
    public int getTaskCount() {
        for (Employee employee : listOfEmployees) { // go through list of employees and return amount of task each one of them hava completed
    
            return employee.getTaskCount();
        }
        return 0;
    }

    @Override
    public int getResourceCount() {
        // for (Employee employee : listOfEmployees) {
        //     if (employee.getResourceCount() > 1) { // if manager has underManagers, then return those resource count
        //         return this.listOfEmployees.size() + employee.getResourceCount();
        //     }
        // }
        // return this.listOfEmployees.size() + 1; // because include this manager too
        
        int totalResourceCount = 0;
        for (Employee employee : listOfEmployees) {
            totalResourceCount += employee.getResourceCount();
        }
        return totalResourceCount + 1;
    }




}
