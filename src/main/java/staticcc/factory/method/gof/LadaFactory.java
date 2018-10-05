package staticcc.factory.method.gof;

public class LadaFactory implements ImplementMeImAFactory {

    public Vehicle createVehicle() {
        return new Lada();
    }

}
