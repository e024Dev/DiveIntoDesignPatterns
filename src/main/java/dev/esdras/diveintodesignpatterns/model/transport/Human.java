package dev.esdras.diveintodesignpatterns.model.transport;

public class Human implements Driver{
    @Override
    public void navigate() {
        System.out.println("Interface Humana!");
    }
}
