package dev.esdras.diveintodesignpatterns.model.transport;

public abstract class Transport {
    protected final Engine engine;
    protected final Driver driver;

    public Transport(Engine engine, Driver driver) {
        this.engine = engine;
        this.driver = driver;
    }

    public abstract void deliver(String destination, String cargo);
}
