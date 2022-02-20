package dev.esdras.diveintodesignpatterns.model.transport;

public class EletricEngine implements Engine{
    @Override
    public void move() {
        System.out.println("Motor Elétrico!");
    }
}
