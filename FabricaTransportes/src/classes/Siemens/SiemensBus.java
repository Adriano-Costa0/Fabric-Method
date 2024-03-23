package classes.Siemens;

import interfaces.Transport;

public class SiemensBus implements Transport {

    @Override
    public void showInfo() {
        System.out.println("\n________ Onibus Siemens ________");
        System.out.println("Numero de assentos: " + 56);
        System.out.println("Pagamento: Dinheiro, Ticket, Cartao");
        System.out.println("Rota: Goiania (GO) -> Acre(AC)");
        System.out.println("Ar-condicionado: Sim");
        System.out.println("Wifi: Não");
        System.out.println("Carregador: Sim");
    }

}
