package staticcc.factory.method.gof;

public class MercedesFactory implements ImplementMeImAFactory {

    public Vehicle createVehicle() {
        return new Mercedes();
    }

}
