package interfaces;

public abstract class Refrigerante extends BaseProduto implements Produto {

  public Refrigerante(double preço, String validade) {
    super(preço, validade);
  }

}
