package oving6.delegation.office;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import java.util.function.BinaryOperator;


public class Manager implements Employee {

    private Collection<Employee> listOfEmployees = new ArrayList<Employee>();

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
        // need to check if employee already has printed or done a calculation
            if (!employee.has) {
                employee.printDocument(document);
                // need to somehow increment manager taskcount
            }
            
       }

    }

    @Override
    public int getTaskCount() {
        int taskCount = 0;
        for (Employee employee : listOfEmployees) { // go through list of employees and return amount of task each one of them hava completed
            // need to only delegate one task per clerk each time
            taskCount += employee.getTaskCount();
            
            
        }
        return taskCount - 1; // subtract managers task, because we only want clerks tasks

        
    }

    // need to add a method that checks how many tasks manager is returning

    public boolean checkHowManyTask() {
        int tasks = this.getTaskCount();
        if (tasks == 1) {
            return true;
        }
        return false;
    }

    @Override
    public int getResourceCount() {
        int resourceCount = 0; // add up all resourcecounts for clerks under manager
        for (Employee employee : listOfEmployees) {
            if (employee.getTaskCount() == 1) {
                resourceCount = 1;
            }
            resourceCount += employee.getResourceCount(); // because manager is including himself
        }
        return resourceCount + 1;
    }  

    



}
