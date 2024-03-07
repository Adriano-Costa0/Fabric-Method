import classes.FabricBoloLaranja;
import interfaces.Factory;
import interfaces.Produto;

public class Main {
    public static void main(String[] args) {
        Factory fabricBoloLaranja = new FabricBoloLaranja();

        Produto boloLaranja = fabricBoloLaranja.criarProduto();

        boloLaranja.exibirInfoProduto();
        
        boloLaranja.setPreço(4.44);
        
        boloLaranja.exibirInfoProduto();

    }
}