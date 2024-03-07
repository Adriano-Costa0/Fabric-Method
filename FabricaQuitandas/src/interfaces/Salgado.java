package interfaces;

public abstract class Salgado extends BaseProduto implements Produto {

  public Salgado(double preço, String validade) {
    super(preço, validade);
  }

}
