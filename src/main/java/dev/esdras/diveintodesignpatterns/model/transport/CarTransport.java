package dev.esdras.diveintodesignpatterns.model.transport;

public class CarTransport extends Transport {

    public CarTransport(Engine engine, Driver driver) {
        super(engine, driver);
    }

    @Override
    public void deliver(String destination, String cargo) {
        System.out.println("Realizando entrega...");
        this.engine.move();
        this.driver.navigate();
    }
}
