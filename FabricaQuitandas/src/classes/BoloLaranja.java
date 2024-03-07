package classes;

import interfaces.Bolo;

public class BoloLaranja extends Bolo {

    public BoloLaranja(double preço, String validade) {
        super(preço, validade);
    }

    @Override
    public void exibirInfoProduto() {
        System.out.println("\nProduto: Bolo de Laranja");
        System.out.println("Id: " + this.getId());
        System.out.println("Validade: " + this.getValidade());
        System.out.println("Preço: " + this.getPreço()+"\n");
    }


}
