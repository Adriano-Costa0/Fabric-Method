package classes.MercedesBenz;

import interfaces.Transport;

public class MercedesSubway implements Transport {

    @Override
    public void showInfo() {
        System.out.println("\n________ Metro Mercedes Benz ________");
        System.out.println("Numero de assentos: " + 212);
        System.out.println("Numero de vagoes: " + 14);
        System.out.println("Velocidade media: 15 km/h");
        System.out.println("Linhas: São Gonçalo -> Santos Dumont");
        System.out.println("Ar-condicionado: Sim");
        System.out.println("Wifi: Não");
    }

}
