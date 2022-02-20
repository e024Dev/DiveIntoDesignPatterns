package dev.esdras.diveintodesignpatterns.model;

import java.util.Arrays;
import java.util.List;

public class Company {

    public void createSoftware() {
        List<Employee> employees = Arrays.asList(
                new Designer(),
                new Programmer(),
                new Tester());

        employees.forEach(Employee::doWork);
    }
}
