package classes;

import classes.MercedesBenz.MercedesBus;
import interfaces.Transport;
import interfaces.TransportFactory;

public class MercedesBenzBusFactory implements TransportFactory {

    @Override
    public Transport createTransport() {
        return new MercedesBus();
    }

}
