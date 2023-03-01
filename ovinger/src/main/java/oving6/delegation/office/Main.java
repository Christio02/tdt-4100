package oving6.delegation.office;

import java.util.ArrayList;
import java.util.Collection;

import oving6.observable.Stock;

public class Main {
    

    public static void main(String[] args) {
        Printer printer = new Printer();
        Employee clerk1 = new Clerk(printer);
        Employee clerk2 = new Clerk(printer);

        Collection<Employee> employees = new ArrayList<>();
        employees.add(clerk1); employees.add(clerk2);

        Manager manager = new Manager(employees);
        System.out.println(manager.getTaskCount());
        // double value = manager.doCalculations((x, y) -> x + y, 2, 3);
        // System.out.println(value);
        // System.out.println(manager.getTaskCount());
        manager.printDocument("Figma");
        // System.out.println(manager.getTaskCount());
        
        // System.out.println(printer.getPrintHistory(clerk1));
        // System.out.println(printer.getPrintHistory(clerk2));
        System.out.println(printer.getPrintHistory(clerk1));


        };
        
    


}
