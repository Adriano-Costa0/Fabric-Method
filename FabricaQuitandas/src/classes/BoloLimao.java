package classes;

import interfaces.Bolo;

public class BoloLimao extends Bolo {

    public BoloLimao(double preço, String validade) {
        super(preço, validade);
    }

    @Override
    public void exibirInfoProduto() {
        System.out.println("Id: " + this.getId());
        System.out.println("Validade: " + this.getValidade());
        System.out.println("Preço: " + this.getPreço());
    }

}
