package of4;

public class Employee {

    private Department employer;

    public Employee(Department employer) {
        this.employer = employer; // don't need to validate, since when creating object it cannot be part of an already existing department
        this.employer.addEmployee(this);
    }

    public void promote() {
    
        this.employer.removeEmployee(this); // remove me (employee) from current employer employee collection
        this.employer = this.employer.getParDepartment(); // removes this employee current department and adds the new department
        this.employer.addEmployee(this); // the new department gets you (employee)

        
    }

    public void quit() {
        if (this.employer == null) {
            throw new IllegalStateException("Kan ikke fjerne relasjon til department som ikke eksisterer!");
        }
        this.employer.removeEmployee(this); // need to do THIS LINE first, to remove you from the collection of employees
        this.employer = null; // then set (your) employer (department) to null, to remove relation
        
    }








    
}
