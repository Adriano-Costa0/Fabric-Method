package classes;

import interfaces.Factory;
import interfaces.Produto;

public class FabricBoloLimao implements Factory {

    @Override
    public Produto criarProduto() {
        return new BoloLimao(200, "01/01/0001");
    }
    
}
