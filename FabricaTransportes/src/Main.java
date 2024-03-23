import classes.IMercedesBenzFactory;
import classes.ISiemensFactory;
import interfaces.Transport;
import interfaces.TransportationFactory;

public class Main {
    public static void main(String[] args) {
        TransportationFactory mercedes = new IMercedesBenzFactory();
        TransportationFactory siemens = new ISiemensFactory();

        Transport busM = mercedes.createBus();
        Transport subwayM = mercedes.createSubway();

        busM.showInfo();
        subwayM.showInfo();

        Transport busS = siemens.createBus();
        Transport subwayS = siemens.createSubway();

        busS.showInfo();
        subwayS.showInfo();

    }
}
