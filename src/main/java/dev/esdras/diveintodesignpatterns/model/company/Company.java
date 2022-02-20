package dev.esdras.diveintodesignpatterns.model.company;

import java.util.List;

public abstract class Company {

    private final List<Employee> employees = getEmployees();
    public abstract List<Employee> getEmployees();

    public void createSoftware() {
        System.out.printf("%s criando software...%n", this.getClass().getSimpleName());
        employees.forEach(Employee::doWork);
        System.out.println("\n");
    }
}
