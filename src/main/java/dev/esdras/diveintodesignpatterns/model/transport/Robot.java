package dev.esdras.diveintodesignpatterns.model.transport;

public class Robot implements Driver{
    @Override
    public void navigate() {
        System.out.println("Interface Automatizada!");
    }
}
