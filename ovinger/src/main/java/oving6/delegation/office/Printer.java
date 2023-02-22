package oving6.delegation.office;

import java.util.ArrayList;
import java.util.List;

public class Printer {

    private Employee employee;
    private List<String> listOfDocuments= new ArrayList<String>();

    public void printDocument(String document, Employee employee) {
        System.out.println("Document: " + " " + document);
        if (!listOfDocuments.contains(document)) {
            listOfDocuments.add(document);
        }
        else {
            ;
        }
        
    }

    public List<String> getPrintHistory(Employee employee) {
        if (employee.getTaskCount() == 0) {
            return List.of(); // returns empty list of employee has no tasks
        }
        // should return list of all documents printed by employee;
        return this.listOfDocuments;
    }

}
