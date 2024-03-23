package classes;

import classes.Siemens.SiemensBus;
import interfaces.Transport;
import interfaces.TransportFactory;

public class SiemensBusFactory implements TransportFactory {

    @Override
    public Transport createTransport() {
        return new SiemensBus();
    }

}
