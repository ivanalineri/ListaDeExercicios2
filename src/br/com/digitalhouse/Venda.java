package br.com.digitalhouse;

public class Venda {
    private String cliente;
    private String carro;
    private double valorDeVenda;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public double getValorDeVenda() {
        return valorDeVenda;
    }

    public void setValorDeVenda(double valorDeVenda) {
        this.valorDeVenda = valorDeVenda;
    }

    public Venda(String cliente, String carro, double valorDeVenda) {
        this.cliente = cliente;
        this.carro = carro;
        this.valorDeVenda = valorDeVenda;
    }
}
