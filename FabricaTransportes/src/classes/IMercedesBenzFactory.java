package classes;

import interfaces.Transport;
import interfaces.TransportationFactory;

public class IMercedesBenzFactory implements TransportationFactory {

    @Override
    public Transport createBus() {
        return new MercedesBenzBusFactory().createTransport();
    }

    @Override
    public Transport createSubway() {
        return new MercedesBenzSubwayFactory().createTransport();
    }

}
