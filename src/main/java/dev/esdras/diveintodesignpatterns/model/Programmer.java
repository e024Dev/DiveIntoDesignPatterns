package dev.esdras.diveintodesignpatterns.model;

public class Programmer implements Employee{

    @Override
    public void doWork() {
        System.out.println("Programmer working...");
    }
}
