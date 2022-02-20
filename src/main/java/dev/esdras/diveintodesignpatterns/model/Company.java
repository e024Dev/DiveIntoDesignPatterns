package dev.esdras.diveintodesignpatterns.model;

public class Company {

    public void createSoftware() {
        Designer designer = new Designer();
        Programmer programmer = new Programmer();
        Tester tester = new Tester();

        designer.designArchitecture();
        programmer.writeCode();
        tester.testSoftware();
    }
}
