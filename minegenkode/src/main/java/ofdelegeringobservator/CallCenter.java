package ofdelegeringobservator;

import java.util.ArrayList;
import java.util.List;

public class CallCenter implements CallRecipient {

    private List<Employee> employees = new ArrayList<>(); // relation 1-many to all employees
    // private Employee employee;

    public CallCenter() {

    }


    public void addEmployee(Employee employee) {
        if (!this.employees.contains(employee)) {
            this.employees.add(employee);
        }

        // usually exception here, but don't have time for it
            
    }

    @Override
    public void answerCall(String call) {
        String role;

        if (call.equals("klage")) {
            role = "Junior";

        } else if (call.equals("internt")) {
            role = "HR";

        } else if (call.equals("advanced")) {
            role = "Teamleder";

        } else {
            role = "Junior";
        }

        this.getEmployeeForTask(role).answerCall(call); // gets employee and delegate task
       
    }

    private Employee getEmployeeForTask(String role) { // logic to delegate to employee with least tasks
        
        return this.employees.stream()
        .filter(employee -> employee.getRole().equals(role)) // check if employee has the role
        .min((employee, employee2) -> employee.getNumberOfCalls() - employee2.getNumberOfCalls()) // comparator that returns employee with least amount of tasks completed
        .get(); // gets that employee
    }



    


}


   