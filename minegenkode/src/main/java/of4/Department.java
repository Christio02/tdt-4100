package of4;

import java.util.ArrayList;
import java.util.Collection;



public class Department { // 1-n relation between parent department and child departments. 

   
    private Department parDepartment;
    private Collection<Department> subDepartments = new ArrayList<>();
    private Collection<Employee> employees = new ArrayList<>();
    

    public Department(Department parDepartment) { // default constructor to set the parent of department
        this.parDepartment = parDepartment;
        this.parDepartment.addSubDepartment(this); // who is the childDepartment? THIS, You are at the child, and the parent needs to know the children
    }

    public Department() { // headquarter that does not have a parent

    }

    public Department getParDepartment() {
        return this.parDepartment;
    }

    private void addSubDepartment(Department subDepartment) {
        if (this.subDepartments.contains(subDepartment)) {
            throw new IllegalArgumentException("Kan ikke legge samme department i childdepartments!");
        }
        this.subDepartments.add(subDepartment);
        
    }


    public boolean containsDep(Department other) {
        for (Department department : this.subDepartments) {
            if (department == other || department.subDepartments.contains(other)) { // hvis underavdelingen eller underavdelingen sine underavdelinger har other, return true
                return true;
            } 
        }
        return false;
    }

    public void addEmployee(Employee employee) {
        if (this.employees.contains(employee)) {
            throw new IllegalArgumentException("Allerede ansatt!");
        }
        this.employees.add(employee);
        
    }

    public void removeEmployee(Employee employee) {
        if (!this.employees.contains(employee)) {
            throw new IllegalArgumentException("Kan ikk fjerne en ansatt som ikke er ansatt i bedriften!");
        }
        this.employees.remove(employee);   
    }



    public Collection<Department> getSubDepartments() {
        return this.subDepartments;
    }


    @Override
    public String toString() {
        return "{" +
            " parDepartment='" + getParDepartment() + "'" +
            ", subDepartments='" + getSubDepartments() + "'" +
            "}";
    }


    public static void main(String[] args) {
        Department dep1 = new Department();  // sets departmnet to null, default without constructor
        Department dep2 = new Department(dep1);
        dep2.getSubDepartments();

        System.out.println(dep2.getSubDepartments());


    }
}
