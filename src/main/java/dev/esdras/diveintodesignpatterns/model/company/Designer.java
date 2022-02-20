package dev.esdras.diveintodesignpatterns.model.company;

public class Designer implements Employee{

    @Override
    public void doWork() {
        System.out.println("Desiger working...");
    }
}
