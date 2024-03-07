package interfaces;

public abstract class Bolo extends BaseProduto implements Produto {

    public Bolo(double preço, String validade) {
        super(preço, validade);
    }

}
