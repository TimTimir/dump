package org.flomintv.staticcc.factory.method.man;

public class Tamara extends Cleaner {

    public Tamara(Integer desiredCleanlinessLevel) {
        super(desiredCleanlinessLevel);
    }

    public void cleanSomethingAdditionally() {
        System.out.println("Let's pretend that I clean something outside official price list");
    }

}
