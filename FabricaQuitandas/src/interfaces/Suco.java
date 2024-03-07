package interfaces;

public abstract class Suco extends BaseProduto implements Produto {

  public Suco(double preço, String validade) {
    super(preço, validade);
  }

}
