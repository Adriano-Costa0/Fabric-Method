package classes;

import interfaces.Factory;
import interfaces.Produto;

public class FabricBoloLaranja implements Factory {

    @Override
    public Produto criarProduto() {
        return new BoloLaranja(300, "24/12/2000");
    }
    
}
