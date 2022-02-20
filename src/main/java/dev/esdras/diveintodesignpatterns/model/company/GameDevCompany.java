package dev.esdras.diveintodesignpatterns.model.company;

import java.util.Arrays;
import java.util.List;

public class GameDevCompany extends Company{
    @Override
    public List<Employee> getEmployees() {
        return Arrays.asList(new Designer(), new Programmer(), new Tester());
    }
}
