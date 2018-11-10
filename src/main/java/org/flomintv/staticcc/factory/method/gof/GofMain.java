package org.flomintv.staticcc.factory.method.gof;

public class GofMain {

    /*
    * https://dzone.com/articles/java-the-factory-pattern
    */
    public static void main(String[] args) {
        ImplementMeImAFactory vehicleFactory = new BMWFactory();
        Vehicle letsMakeSomeWroomWroom = vehicleFactory.createVehicle();
        letsMakeSomeWroomWroom.makeWroomWroom();

        vehicleFactory = new MercedesFactory();
        letsMakeSomeWroomWroom = vehicleFactory.createVehicle();
        letsMakeSomeWroomWroom.makeWroomWroom();

        vehicleFactory = new LadaFactory();
        letsMakeSomeWroomWroom = vehicleFactory.createVehicle();
        letsMakeSomeWroomWroom.makeWroomWroom();
    }

}
