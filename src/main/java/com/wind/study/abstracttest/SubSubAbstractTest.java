package com.wind.study.abstracttest;

class SubSubAbstract extends SubAbstractTest implements InterfaceTest {
    @Override
    void abs03() {
        System.out.println("abs03");
    }

    @Override
    public void x() {

    }
}


/**
 * @author hsc
 */
public class SubSubAbstractTest {
    public static void main(String[] args) {
        SubSubAbstract ssa = new SubSubAbstract();
        ssa.abs01();
        ssa.abs02();
        ssa.abs03();
    }
}
