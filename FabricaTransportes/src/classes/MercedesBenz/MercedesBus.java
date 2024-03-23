package classes.MercedesBenz;

import interfaces.Transport;

public class MercedesBus implements Transport {

    @Override
    public void showInfo() {
        System.out.println("\n________ Onibus Mercedes Benz ________");
        System.out.println("Numero de assentos: " + 64);
        System.out.println("Pagamento: Dinheiro, Ticket");
        System.out.println("Rota: São Jose do Rio Preto (SP) -> Pelotas(RS)");
        System.out.println("Ar-condicionado: Sim");
        System.out.println("Wifi: Sim");
        
        
    }

}
