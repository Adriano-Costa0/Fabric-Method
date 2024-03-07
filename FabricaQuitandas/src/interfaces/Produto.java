package interfaces;

public interface Produto {
    public void exibirInfoProduto();

    public int getId();

    public void setValidade(String Validade);

    public String getValidade();

    public void setPreço(double Preço);

    public double getPreço();
}
