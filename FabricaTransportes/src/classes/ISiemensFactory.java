package classes;

import interfaces.Transport;
import interfaces.TransportationFactory;

public class ISiemensFactory implements TransportationFactory {

    @Override
    public Transport createBus() {
        return new SiemensBusFactory().createTransport();
    }

    @Override
    public Transport createSubway() {
        return new SiemensSubwayFactory().createTransport();
    }

}
