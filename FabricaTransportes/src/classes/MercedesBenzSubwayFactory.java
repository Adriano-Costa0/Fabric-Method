package classes;

import classes.MercedesBenz.MercedesSubway;
import interfaces.Transport;
import interfaces.TransportFactory;

public class MercedesBenzSubwayFactory implements TransportFactory {

    @Override
    public Transport createTransport() {
        return new MercedesSubway();
    }

}
