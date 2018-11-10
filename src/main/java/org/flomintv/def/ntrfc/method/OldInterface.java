package org.flomintv.def.ntrfc.method;

public interface OldInterface {

    void existingMethod();

    default void newDefaultMethod() {
        System.out.println("New default method" + " is added in interface");
    }

}
