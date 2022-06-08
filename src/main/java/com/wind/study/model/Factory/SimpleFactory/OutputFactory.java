package com.wind.study.model.Factory.SimpleFactory;

public class OutputFactory {
    public Output getOutput() {
        return new Printer();
    }

    public static void main(String[] args) {
        OutputFactory of = new OutputFactory();
        Computer c = new Computer(of.getOutput());
        c.keyIn("1");
        c.print();
    }
}
