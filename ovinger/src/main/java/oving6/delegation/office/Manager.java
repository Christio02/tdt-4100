package oving6.delegation.office;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import java.util.function.BinaryOperator;


public class Manager implements Employee {

    private Collection<Employee> listOfEmployees = new ArrayList<Employee>();
    private int taskCount = 0;

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
            if (employee instanceof Clerk) { // if the employee in list is Clerk
                Clerk clerk = (Clerk) employee; // then cast employee as clerk
                if (!clerk.hasCompletedTask()) { // if clerk has not yet completed task, then delegate to that clerk
                    clerk.printDocument(document);
                    return; // do not continue
                }
            } else  {
                employee.printDocument(document);
            }
        }

       }

    @Override
    public int getTaskCount() {
        int taskCount = 0;
        for (Employee employee : listOfEmployees) { // go through list of employees and return amount of task each one of them hava completed
            taskCount += employee.getTaskCount();
        }
        return taskCount; // subtract managers task, because we only want clerks tasks

        
    }

    // need to add a method that checks how many tasks manager is returning


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
