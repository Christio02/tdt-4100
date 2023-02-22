package oving6.delegation.office;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Printer {

    private Map<Employee, ArrayList<String>> totalTasks = new HashMap<Employee, ArrayList<String>>(); // new "dictionary" that keeps track of all employees and their documents 

    public void printDocument(String document, Employee employee) {
        System.out.println("Document: " + " " + document);

        ArrayList<String> newList= new ArrayList<String>(); // initzialising new list that keeps track of 
        if (totalTasks.containsKey(employee)) {
            newList = totalTasks.get(employee); // if hashmap does not
            // contain employee , then create new list and assign value of the key employee to that list
        }
        newList.add(document); // add document to list
        totalTasks.put(employee, newList); // then add key value pair to hashmap
        
    }

    public List<String> getPrintHistory(Employee employee) {
        if (totalTasks.get(employee) == null) {
            
            return new ArrayList<String>(); // returns empty list of employee has no tasks
        }
        return Collections.unmodifiableList(totalTasks.get(employee));
        // return totalTasks.get(employee); // returns list of all documents printed by employee;
    }   // essentially returns the key value pair of the employee

}
