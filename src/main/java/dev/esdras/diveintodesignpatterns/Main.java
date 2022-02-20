package dev.esdras.diveintodesignpatterns;

import dev.esdras.diveintodesignpatterns.model.company.GameDevCompany;
import dev.esdras.diveintodesignpatterns.model.company.OutsourcingCompany;
import dev.esdras.diveintodesignpatterns.model.transport.CarTransport;
import dev.esdras.diveintodesignpatterns.model.transport.CombustionEngine;
import dev.esdras.diveintodesignpatterns.model.transport.Human;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dive into Design Patterns\n");

        CarTransport carTransport =  new CarTransport(new CombustionEngine(), new Human());

        carTransport.deliver("Araras", "Teste");

    }
}
