package interfaces;

import java.security.SecureRandom;

public abstract class BaseProduto {
    int id;
    double preço;
    String validade;

    private SecureRandom rand = new SecureRandom();

    public BaseProduto(double preço, String validade) {
        this.id = rand.nextInt(10000);
        this.preço = preço;
        this.validade = validade;
    }

    public int getId() {
        return this.id;
    }

    public String getValidade() {
        return this.validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public double getPreço() {
        return this.preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

}
