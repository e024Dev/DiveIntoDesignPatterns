package dev.esdras.diveintodesignpatterns;

import dev.esdras.diveintodesignpatterns.model.Company;
import dev.esdras.diveintodesignpatterns.model.GameDevCompany;
import dev.esdras.diveintodesignpatterns.model.OutsourcingCompany;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dive into Design Patterns\n");

        GameDevCompany gameDevCompany = new GameDevCompany();
        OutsourcingCompany outsourcingCompany = new OutsourcingCompany();
        gameDevCompany.createSoftware();
        outsourcingCompany.createSoftware();

    }
}
