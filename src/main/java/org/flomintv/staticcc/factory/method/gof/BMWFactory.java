package org.flomintv.staticcc.factory.method.gof;

public class BMWFactory implements ImplementMeImAFactory {

    public Vehicle createVehicle() {
        return new BMW();
    }

}
