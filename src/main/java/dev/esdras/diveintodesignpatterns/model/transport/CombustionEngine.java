package dev.esdras.diveintodesignpatterns.model.transport;

public class CombustionEngine implements Engine{
    @Override
    public void move() {
        System.out.println("Motor combustão!");
    }
}
