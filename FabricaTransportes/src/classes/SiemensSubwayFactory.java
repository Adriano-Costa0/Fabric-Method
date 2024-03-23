package classes;

import classes.Siemens.SiemensSubway;
import interfaces.Transport;
import interfaces.TransportFactory;

public class SiemensSubwayFactory implements TransportFactory {

    @Override
    public Transport createTransport() {
        return new SiemensSubway();
    }

}
