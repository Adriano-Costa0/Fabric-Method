package classes.Siemens;

import interfaces.Transport;

public class SiemensSubway implements Transport {

    @Override
    public void showInfo() {
        System.out.println("\n________ Metro Siemens ________");
        System.out.println("Numero de assentos: " + 244);
        System.out.println("Numero de vagoes: " + 19);
        System.out.println("Velocidade media: 22 km/h");
        System.out.println("Linhas: Sergipe -> Nossa senhora do carmo");
        System.out.println("Ar-condicionado: Sim");
        System.out.println("Wifi: Sim");
    }

}
