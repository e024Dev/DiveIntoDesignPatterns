package dev.esdras.diveintodesignpatterns.model.company;

public class Programmer implements Employee{

    @Override
    public void doWork() {
        System.out.println("Programmer working...");
    }
}
